package com.java24.brix.ports;

import com.java24.brix.ports.drinkoptions.Drink;
import com.java24.brix.ports.drinkoptions.Milk;
import com.java24.brix.ports.drinkoptions.Size;

public record LineItem(Drink drink, Milk milk, Size size, int quantity) {
}
