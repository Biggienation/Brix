package com.java24.infrastructure.ports.api.rest;

import com.java24.brix.ports.api.PlaceAnOrder;
import com.java24.infrastructure.ports.api.rest.dto.OrderRequest;
import com.java24.infrastructure.ports.api.rest.dto.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class OrderController {
    private final PlaceAnOrder placeAnOrder;

    public OrderController(PlaceAnOrder placeAnOrder) {
        this.placeAnOrder = placeAnOrder;
    }

    @PostMapping("/orders")
    ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest request, UriComponentsBuilder builder) {
        var order = placeAnOrder.placeOrder(request.toDomain());
        var location = builder.path("/orders/{id}").buildAndExpand(order.getId()).toUri();
        return ResponseEntity.created(location).body(OrderResponse.fromDomain(order));
    }

}

