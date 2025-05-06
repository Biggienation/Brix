package com.java24.brix.ports;


import com.java24.brix.ports.drinkoptions.Location;
import com.java24.brix.ports.drinkoptions.Stauts;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id = UUID.randomUUID();
    private final Location location;
    private final List<LineItem> items;
    private Stauts stauts;

    public Order(Location location, List<LineItem> items) {
        this.location = location;
        this.items = items;
    }
    public UUID getId() {
        return id;
    }
    public Location getLocation() {
        return location;
    }
    public List<LineItem> getItems() {
        return items;
    }

    public Stauts getStauts() {
        return stauts;
    }

    public void setStauts(Stauts stauts) {
        this.stauts = stauts;
    }

    public BigDecimal getCost() {
        return BigDecimal.ZERO;
    }
}
