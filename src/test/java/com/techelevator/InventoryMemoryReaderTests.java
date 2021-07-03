package com.techelevator;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import java.io.FileNotFoundException;

public class InventoryMemoryReaderTests {

    private InventoryMemoryReader inventoryMemoryReader;

    @Before
    public void setup() throws FileNotFoundException {
        inventoryMemoryReader = new InventoryMemoryReader();
    }

    @Test
    public void inventory_has_items_after_instantiation() throws FileNotFoundException {
        Map<String, CateringItem> actualResult = inventoryMemoryReader.read();
        Assert.assertFalse(actualResult.entrySet().isEmpty());
    }


}
