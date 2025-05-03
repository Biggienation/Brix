package com.java24.brix.serviceprovider;

import com.java24.brix.service.Calculator;

public class NormalCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
