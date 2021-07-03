package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Map;

public class CateringMachine {

    private Inventory inventory;

    public CateringMachine(String filename) throws FileNotFoundException {
        inventory = new Inventory(filename);
    }

    public Map<String, CateringItem> getInventory() {
        return inventory.getItems();
    }

    public void remove(CateringItem cateringItem) {

    }

    public CateringItem getCateringItemByProductCode(String productCode){
        return inventory.getItems().get(productCode);
    }

    public String getInventoryAsString() {
        return inventory.toString();
    }

    public String makeChange(double amountOfMoney) {
        int nickels = 0;
        int dimes = 0;
        int quarter = 0;
        int ones = 0;
        int fives = 0;
        int tens = 0;
        int twenties = 0;

        while (amountOfMoney >= 20) {
            twenties++;
            amountOfMoney -= 20;

        }
        while (amountOfMoney >= 10) {
            tens++;
            amountOfMoney -= 10;

        }
        while (amountOfMoney >= 5) {
            fives++;
            amountOfMoney -= 5;
        }
        while (amountOfMoney >= 1) {
            ones++;
            amountOfMoney -= 1;
        }
        while (amountOfMoney >= 0.25) {
            quarter++;
            amountOfMoney -= 0.25;
        }
        while (amountOfMoney >= 0.10) {
            dimes++;
            amountOfMoney -= 0.10;
        }
        while (amountOfMoney >= 0.05) {
            nickels++;
            amountOfMoney -= 0.05;
        }

        String change = "";

        if (twenties > 0){
            change += " Twenties: " + twenties;
        }
        if (tens > 0){
            change += " Tens: "+ tens;
        }
        if (fives > 0){
            change += " Fives: "+ fives;
        }
        if (ones > 0){
            change += " Ones: "+ ones;
        }
        if (quarter > 0){
            change += " Quarters: "+ quarter;
        }
        if (dimes > 0){
            change += " Dimes: " + dimes;
        }
        if (nickels > 0){
            change += " Nickles: "+ nickels;
        }

        return change;
    }
}
