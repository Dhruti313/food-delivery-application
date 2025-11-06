package com.fooddelivery.order.kafka.publisher;

import com.fooddelivery.order.event.OrderCreatedEvent;
import com.fooddelivery.order.event.OrderStatusChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {

    @Autowired
    private KafkaTemplate<String, Object> jsonKafkaTemplate;

    public void publishOrderCreatedEvent(OrderCreatedEvent event) {
        jsonKafkaTemplate.send("order-created", event.getOrderId().toString(), event);
    }

    public void publishOrderStatusChangedEvent(OrderStatusChangedEvent event) {
        jsonKafkaTemplate.send("order-status-changed", event.getOrderId().toString(), event);
    }
}