# Use official Java runtime as base image
FROM openjdk:22-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy jar file into container
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar

# Expose port (change if your service runs on another port)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "order-service.jar"]
