package com.java24.brix;

import com.java24.brix.ports.CoffeeShop;
import com.java24.brix.ports.Order;
import com.java24.brix.ports.api.PlaceAnOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderingCoffeeTest {
    @Test
    @DisplayName("Place an Coffee order")
    void OrderACoffee() {
        //Given
        PlaceAnOrder placeAnORder = new CoffeeShop();
        //when
        Order order = new Order();
        Order placedOrder = placeAnORder.placeOrder(order);
        //then
        assertThat(placedOrder).isNotNull();
    }

}
