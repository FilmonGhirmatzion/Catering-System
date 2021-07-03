package com.techelevator;

public class Money {
    private String name;
    private double value;

    public Money(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
