package com.fooddelivery.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private Long customerId;
    private Long restaurantId;
    private String deliveryAddress;
    private String specialInstructions;
    private List<OrderItemRequest> items;
}