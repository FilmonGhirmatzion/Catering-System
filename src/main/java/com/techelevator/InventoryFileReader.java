package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryFileReader implements InventoryReader{


    private String filePath;
    private File file;

    public InventoryFileReader(String filePath) {
        this.filePath = filePath;

    }

    public Map<String, CateringItem> read() throws FileNotFoundException {
        Map<String, CateringItem> inventory = new HashMap<>();

        // Step 2: Create a File object to reference the file
        File file = new File(filePath);

        // Can use the file object to check if the File exists and if it is a File or a directory
        if (!file.exists()) {
            System.out.println("The file doesn't exist");
        }
        if (!file.isFile()) {
            System.out.println("This is not a file");
        }
        // Step 3: Create a Scanner and pass it the File object
        // With a file object, scanner has a checked FileNotFoundException
        // With a file object, scanner MUST be closed!
        // Put the Scanner in a try-with-resource, which will automatically close the connection
        try (
                Scanner fileScanner = new Scanner(file)) {
            // Loop while hasNextLine() is true, because hasNextLine() will be true when there is more left and
            // false when we are at the end
            while (fileScanner.hasNextLine()) {
                // Read the next line
                String inventoryLine = fileScanner.nextLine();
                String[] lineDetails = inventoryLine.split("\\|");
                inventory.put(lineDetails[0], new CateringItem(lineDetails[0], Double.parseDouble(lineDetails[2]), lineDetails[1], lineDetails[3]));


            }
        } catch (
                FileNotFoundException e) {
            System.out.println("The File was not found");
        }
        return inventory;
    }
}









    /*
        B1|Soda|1.50|B
B2|Wine|3.05|B
B3|Beer|2.55|B
B4|Sparkling Water|2.35|B
B5|Punch|0.90|B
A1|Tropical Fruit Bowl|3.50|A
A2|Meatballs|2.95|A
A3|Bacon Wrapped Shrimp|4.15|A
A4|Bruschetta|2.65|A
E1|Baked Chicken|8.85|E
E2|Pork Loin|9.45|E
E3|BBQ Ribs|11.65|E
E4|Beef and Gravy|5.15|E
D1|NY Style Cheesecake|2.55|D
D2|Cake|1.80|D
D3|Brownies|1.10|D
D4|Jolly Ranger Tart|0.85|D
D5|Apple Pie|2.50|D
         */

