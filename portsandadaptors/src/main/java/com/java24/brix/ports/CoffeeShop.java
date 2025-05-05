package com.java24.brix.ports;

import com.java24.brix.ports.api.PlaceAnOrder;
import com.java24.brix.ports.spi.Orders;

public class CoffeeShop implements PlaceAnOrder {
    private final Orders orders;

    public CoffeeShop(Orders orders){
        this.orders = orders;
    }

    @Override
    public Order placeOrder (Order order){
        return orders.save(order);
    }

}
