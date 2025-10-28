package com.fooddelivery.order.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatusChangedEvent {

    private Long orderId;
    private String oldStatus;
    private String newStatus;
    private LocalDateTime changedAt;
}