package com.java24.brix.serviceprovider;

import com.java24.brix.service.Calculator;
import com.java24.brix.service.Description;

@Description("Returns a Random number instead of that actual solution")
public class FunnyCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return (int) (Math.random() * 1000);
    }
}
