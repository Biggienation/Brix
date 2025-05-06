package com.java24.infrastructure.config;

import com.java24.brix.ports.CoffeeShop;
import com.java24.brix.ports.api.PlaceAnOrder;
import com.java24.brix.ports.spi.Orders;
import com.java24.infrastructure.ports.spi.precistance.OrdersJDBSPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public PlaceAnOrder placeAnOrder(Orders orders) {
        return new CoffeeShop(orders);
    }

    @Bean
    public Orders orders(){
        return new OrdersJDBSPort();
    }
    // There is a better way of configuring this.

}
