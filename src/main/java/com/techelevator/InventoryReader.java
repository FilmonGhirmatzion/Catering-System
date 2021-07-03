package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Map;

public interface InventoryReader {



    Map<String , CateringItem> read() throws FileNotFoundException;


}
