/*
*  Lab2_11.java                                         Lab2_11
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/24/17
*
* Calculates the mpg for a trip
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.*;

public class Lab2_11 {

    private static double mileage = 0;
    private static void calculate (double inDist, double fuelUsed){
        mileage = inDist / fuelUsed;
    }

    public static void main (String... args){

        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("Input Trip Start Odometre value (miles): ");
        double startDist = inputScanner.nextDouble();

        System.out.println("Input Trip End Odometre value (miles): ");
        double endDist = inputScanner.nextDouble();
        
        double distTravel = endDist - startDist;

        System.out.println ("Input Galleons Gas Used: ");
        double gasUsed = inputScanner.nextDouble();
        calculate(distTravel, gasUsed);

        System.out.println (MessageFormat.format ("You consumed {0} gallons to travel {1} miles at {2} mpg", gasUsed, distTravel, mileage));

        inputScanner.close();
    }
}