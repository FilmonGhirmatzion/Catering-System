package com.techelevator;

import com.techelevator.CateringItem;

public class Dessert extends CateringItem {

    public Dessert(String code,  String name, double price) {
        super(code, price, name, "D" );
    }
}
