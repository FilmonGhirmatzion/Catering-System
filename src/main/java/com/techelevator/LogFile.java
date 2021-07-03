package com.techelevator;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFile {

    public static void main(String[] args) {
        String pathToTheNewFile = "C:\\Users\\Student\\source\\repos\\team6-java-blue-week04-pair-exercises\\m1-capstone-java-cateringsystem\\src\\main\\java\\com\\techelevator\\Log.txt";
        File fileToWriteTo = new File(pathToTheNewFile);

 //  01/01/2019 12:00:00 PM ADD MONEY: $500.00 $500.00
    }

    public void writeLogEntry(String actionTaken, double startingAccountBalance, double endingAccountBalance){
        String logEntry = getTimeStamp() + actionTaken + "" + startingAccountBalance + endingAccountBalance;
        //
    }
   public String getTimeStamp(){
        LocalDateTime now= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
        return now.format(formatter) ;
   }
}
/*

 */