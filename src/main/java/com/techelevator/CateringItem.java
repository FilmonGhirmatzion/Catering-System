package com.techelevator;

public class CateringItem  {

    private String code;
    private double price;
    private String name;
    private String type;



    public CateringItem(String code, double price, String name, String type) {
        this.code = code;
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        String itemString = code + " " + name + " " + price+ "" + type + "";
        return itemString;

    }
}
