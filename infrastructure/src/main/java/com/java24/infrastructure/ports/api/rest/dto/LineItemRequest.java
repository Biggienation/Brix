package com.java24.infrastructure.ports.api.rest.dto;

import com.java24.brix.ports.LineItem;
import com.java24.brix.ports.drinkoptions.Drink;
import com.java24.brix.ports.drinkoptions.Milk;
import com.java24.brix.ports.drinkoptions.Size;

public record LineItemRequest (Drink drink, Milk milk, Size size, Integer quantity)  {
    public LineItem toDomain(){
        return new LineItem(drink,milk,size,quantity);
    }
}
