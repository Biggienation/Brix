package com.java24.infrastructure.ports.api.rest.dto;

import com.java24.brix.ports.LineItem;
import com.java24.brix.ports.drinkoptions.Drink;
import com.java24.brix.ports.drinkoptions.Milk;
import com.java24.brix.ports.drinkoptions.Size;

public record LineItemResponse(Drink drink, Milk milk, Size size, int quantity) {

    public static LineItemResponse fromDomain(LineItem lineItem) {
        return new LineItemResponse(
                lineItem.drink(),
                lineItem.milk(),
                lineItem.size(),
                lineItem.quantity()
        );
    }
}
