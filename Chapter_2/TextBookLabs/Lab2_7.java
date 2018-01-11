/*
*  Lab2_7.java                                          Lab2_7
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/22/17
*
*  Converts Seconds time to hours minutes and seconds
*/

import java.util.Scanner;
import java.util.concurrent.*;
import javafx.util.converter.*;
import java.time.*;

public class Lab2_7 {

    private static int numberOfHours = 0;
    private static int numberOfMinutes = 0;
    private static int numberOfSeconds = 0;    

    private static void convert (int secIn){
        numberOfHours = (int) (TimeUnit.SECONDS.toHours (secIn));

        numberOfMinutes = (int) ((TimeUnit.SECONDS.toMinutes(secIn)) - 
            (TimeUnit.SECONDS.toHours(secIn) * 60));

        numberOfSeconds = (int) ((TimeUnit.SECONDS.toSeconds(secIn)) - 
            (TimeUnit.SECONDS.toMinutes(secIn) * 60)); 
    }

    public static void main (String...args ){

        Scanner inputNumScanner = new Scanner (System.in);
        
        System.out.println ("Type the number of seconds you want to convert: ");
        int inSec = inputNumScanner.nextInt();

        convert (inSec);        
        
        System.out.println ("You have converted " + inSec + " to ");
        System.out.println (numberOfHours + " hours " + numberOfMinutes + " minutes " + 
             numberOfSeconds + " seconds");
    }
}