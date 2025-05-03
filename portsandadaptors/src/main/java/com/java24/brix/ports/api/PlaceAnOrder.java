package com.java24.brix.ports.api;

import com.java24.brix.ports.Order;

public interface PlaceAnOrder {
    static Order placeOrder(Order order) {
        return order;
    }
}
