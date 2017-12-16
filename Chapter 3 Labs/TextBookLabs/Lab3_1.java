/*
*  Lab3_1.java                                          Lab3_1
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/29/17
*
* Determine the Average of several inputs by the user.
*/

import java.util.*;
import java.text.*;

public class Lab3_1 {

    private static Double prevSum = 0d;

    private static void calculate (double numIn, int numInput) {

        if (numIn == -999) {
            double numAvg = prevSum/(numInput - 1) ;
            System.out.println (MessageFormat.format("The Average of {0} numbers is: {1}", numInput - 1, numAvg));
        } else {
            prevSum  = prevSum + numIn;
        }

    }

    public static void main (String... args) {
        Scanner inputScanenr = new Scanner (System.in);

        double inNum;

        System.out.println ("AVERAGE NUMBER CALCULATOR");

        int count = 0;

        do {
            System.out.println ("Please input a new number (-999 to exit and calculate): ");
            inNum = inputScanenr.nextDouble();
            
            count++;

            calculate(inNum, count);
        } while (inNum != -999);
    }
}