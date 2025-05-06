package com.java24.infrastructure.ports.spi.precistance;

import com.java24.brix.exceptions.OrderNotFound;
import com.java24.brix.ports.Order;
import com.java24.brix.ports.spi.Orders;

public class OrdersJDBSPort implements Orders {


    @Override
    public Order findOrderById(int orderId) throws OrderNotFound {
        return null;
    }

    @Override
    public Order save(Order order) {
        return order;
    }

    @Override
    public void deleteById(int orderId) {

    }
}
