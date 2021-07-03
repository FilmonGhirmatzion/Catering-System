package com.techelevator;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<LineItem> cart= new ArrayList<>();

    public ShoppingCart(List<LineItem> cart) {
        this.cart = cart;
    }

    public ShoppingCart() {

    }

    public List<LineItem> getCart() {
        return cart;
    }
    public double cartTotal(){
        double cost =0;
        for (LineItem item : cart){
            cost += item.getTotalCost();
        }

        return cost;
    }
    public void addItem(CateringItem itemToAdd, int quantity){
        cart.add(new LineItem(quantity , itemToAdd));
    }

    public void addItem(LineItem itemToAdd){
        cart.add(itemToAdd);
    }


    @Override
    public String toString() {
        String cartString = "";
        for (LineItem item : cart){
            cartString += item.toString() + "\n";
        }

        return cartString;
    }

}
