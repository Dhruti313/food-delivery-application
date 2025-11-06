package com.fooddelivery.order.kafka.consumer;

import com.fooddelivery.order.event.OrderCreatedEvent;
import com.fooddelivery.order.event.OrderStatusChangedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventConsumer {

    @KafkaListener(topics = "order-created", groupId = "order-service-group", containerFactory = "jsonKafkaListenerContainerFactory")
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("Order created event received: " + event.getOrderId());
    }

    @KafkaListener(topics = "order-status-changed", groupId = "order-service-group", containerFactory = "jsonKafkaListenerContainerFactory")
    public void handleOrderStatusChanged(OrderStatusChangedEvent event) {
        System.out.println("Order status changed: " + event.getOrderId() + " from " + event.getOldStatus() + " to " + event.getNewStatus());
    }
}