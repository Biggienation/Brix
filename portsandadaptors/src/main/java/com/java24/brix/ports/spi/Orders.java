package com.java24.brix.ports.spi;

import com.java24.brix.exceptions.OrderNotFound;
import com.java24.brix.ports.Order;

public interface Orders {
    Order findOrderById (int orderId) throws OrderNotFound;
    Order save (Order order);
    void deleteById (int orderId);
}
