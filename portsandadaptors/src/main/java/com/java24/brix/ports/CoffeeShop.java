package com.java24.brix.ports;

import com.java24.brix.ports.api.PlaceAnOrder;
import com

public class CoffeeShop implements PlaceAnOrder {
    @Override
    public Order placeOrder (Order order){
        return order;
    }

}
