package com.techelevator;

public class LineItem {

    private int quantity;
    private final CateringItem item;

    public LineItem(int quantity, CateringItem item) {
        this.quantity = quantity;
        this.item =item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return item.getPrice() * quantity;
    }

    public void addToQuantity(int amountToAdd ){
        quantity += amountToAdd;
    }

    @Override
    public String toString() {
        return item.getName() + " $" + item.getPrice() + " each  Quantity: " + quantity + " Item Code: " + item.getCode() + " Total: $" + getTotalCost();
    }
}
