package com.techelevator;

public class SalesIn {
    private String name;
    private int numberOfItemsIn = 0;
    private int price = 0;

    public SalesIn(int numberOfItemsIn, int price, String name) {
        this.numberOfItemsIn = numberOfItemsIn;
        this.price = price;
        this.name = name;
    }

    public int getNumberOfItemsIn() {
        return numberOfItemsIn;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void addToName(String nameToAdd){
        this.name += nameToAdd;
    }

    public void addToPrice(double priceToAdd) {
        this.price += priceToAdd;
    }

    public void addToNumberOfItems(double numberOfItemsIn) {
        this.numberOfItemsIn += numberOfItemsIn;
    }

}
