package com.java24.brix;

import com.java24.brix.ports.*;
import com.java24.brix.ports.api.PlaceAnOrder;
import com.java24.brix.ports.drinkoptions.Drink;
import com.java24.brix.ports.drinkoptions.Location;
import com.java24.brix.ports.drinkoptions.Milk;
import com.java24.brix.ports.drinkoptions.Size;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderingCoffeeTest {

    @Test
    @DisplayName("Place an Coffee order")
    void OrderACoffee() {
        //Given
        InMermmoryOrders orders = new InMermmoryOrders();
        PlaceAnOrder placeAnORder = new CoffeeShop(orders);
        //when
        Order order = new Order(Location.TAKE_AWAY, List.of(new LineItem(Drink.LATTE, Milk.WHOLE, Size.SMALL, 1)));
        Order placedOrder = placeAnORder.placeOrder(order);
        //then
        assertThat(placedOrder).isNotNull();
    }

}
