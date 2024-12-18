package com.worldline.fibonacciapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Fibonacci {
    @Getter @Setter
    private long number;
    @Getter @Setter
    private int index;
    @Getter @Setter
    private boolean isIncluded;

    public Fibonacci(long number, int index, boolean isIncluded) {
        this.number = number;
        this.index = index;
        this.isIncluded = isIncluded;
    }
}
