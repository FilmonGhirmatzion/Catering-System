package com.techelevator;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class InventoryMemoryReader implements InventoryReader{

    @Override
    public Map<String, CateringItem> read() throws FileNotFoundException {

        Map<String, CateringItem> inventory = new HashMap<String, CateringItem>();
        inventory.put("D2", new Dessert("D2" ,"Cake",1.80));
        inventory.put("D3", new Dessert("D3" ,"Brown",1.10));

        return inventory;



    }
}
/*
D2|Cake|1.80|D
D3|Brownies|1.10|D
D4|Jolly Ranger Tart|0.85|D
D5|Apple Pie|2.50|D
 */