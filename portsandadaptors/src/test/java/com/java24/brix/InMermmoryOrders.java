package com.java24.brix;

import com.java24.brix.exceptions.OrderNotFound;
import com.java24.brix.ports.Order;
import com.java24.brix.ports.spi.Orders;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMermmoryOrders implements Orders {
    Map<UUID, Order> orders = new HashMap<>();

    @Override
    public Order findOrderById(int orderId) throws OrderNotFound {
        return null;
    }

    @Override
    public Order save(Order order) {
        orders.put(UUID.randomUUID(), order);
        return order;
    }

    @Override
    public void deleteById(int orderId) {

    }
}
