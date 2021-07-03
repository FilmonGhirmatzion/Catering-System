package com.techelevator;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, CateringItem> items = new HashMap<>();

    public Inventory(String filename) throws FileNotFoundException {
       InventoryReader reader = new InventoryFileReader(filename);
       items = reader.read();

    }

    public Map<String, CateringItem> getItems() {
        return items;
    }

    public void remove(CateringItem item) {


    }

    @Override
    public String toString() {
        String inventoryString ="" ;
        for (CateringItem item: items.values()){
            inventoryString += item.toString() +"\n";


        }
        return inventoryString;
    }
}

