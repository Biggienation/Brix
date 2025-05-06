package com.java24.infrastructure.ports.api.rest.dto;

import com.java24.brix.ports.Order;
import com.java24.brix.ports.drinkoptions.Location;

import java.util.List;

public record OrderRequest (Location location, List<LineItemRequest> items) {
    public Order toDomain(){
        return new Order(location,items.stream().map(LineItemRequest::toDomain).toList());
    }
}
