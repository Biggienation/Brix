package com.java24.infrastructure.ports.api.rest.dto;

import com.java24.brix.ports.Order;
import com.java24.brix.ports.drinkoptions.Location;

import java.math.BigDecimal;
import java.util.List;

public record OrderResponse(Location location, List<LineItemResponse> items, BigDecimal cost) {
    public static OrderResponse fromDomain(Order order){
        return new OrderResponse(
                order.getLocation(),
                order.getItems().stream().map(LineItemResponse::fromDomain).toList(),
                order.getCost()
        );
    }
}
