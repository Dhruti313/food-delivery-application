# 🍔 Order Service - Food Delivery Application

## 🧾 Overview

The **Order Service** is a core microservice of the Food Delivery Application.  
It is responsible for managing customer orders — including order creation, status tracking, and linking with payment and delivery modules.

---

## 🏗️ Architecture

This service follows a layered architecture:

```
com.fooddelivery.order
├── config         # Security and application config
├── controller     # REST APIs (OrderController)
├── dto            # Data Transfer Objects
├── entity         # JPA Entities (Order, OrderItem)
├── event          # Domain events (OrderCreatedEvent, etc.)
├── exception      # Custom exceptions (optional)
├── repository     # JPA Repositories
├── service        # Business logic (OrderService)
└── FoodDeliveryApp1Application.java # Main entry point
```

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Spring Security
- MySQL
- Docker

---

## 🧩 Prerequisites

Make sure you have:

- Java 17+
- Maven 3.9+
- Docker and Docker Compose
- MySQL running locally (or in Docker)

---

## ⚙️ Configuration

**`application.properties`**

```properties
spring.application.name=order-service
spring.datasource.url=jdbc:mysql://host.docker.internal:3309/food-app-dhruti?createDatabaseIfNotExist=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=Admin@123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8081
```

---

## 🐳 Docker Setup

### 1️⃣ Build the JAR

```bash
mvn clean package -DskipTests
```

### 2️⃣ Build Docker Image

```bash
docker build -t order-service .
```

### 3️⃣ Run Container

```bash
docker run -d -p 8081:8081 --name order-service-container order-service
```

### 4️⃣ View Logs

```bash
docker logs -f order-service-container
```

---

## 🧪 API Endpoints

| Method | Endpoint              | Description         |
| ------ | --------------------- | ------------------- |
| POST   | `/orders`             | Create a new order  |
| GET    | `/orders/{id}`        | Get order by ID     |
| GET    | `/orders`             | List all orders     |
| PUT    | `/orders/{id}/status` | Update order status |

Example:

```bash
POST http://localhost:8081/orders
```

---

## 🧱 Future Enhancements

- Integrate with **Payment Service** via Kafka
- Add **JWT Authentication**
- Implement **API Gateway**
- Add **Notifications** for order updates
- Implement **CI/CD** using GitHub Actions

---

## 👩‍💻 Author

**Dhruti Vachhani**  
_Backend Developer | Java | Spring Boot | Microservices_
