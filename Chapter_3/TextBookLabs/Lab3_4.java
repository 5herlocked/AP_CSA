/*
*  Lab3_4.java                                          Lab3_4
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/31/17
*
* Print the sum of all the even integers to a certain point input by the user.
*/

import java.util.*;
import java.text.*;

public class Lab3_4 {
    private static void calculate (double inVal) {
        double outVal = 0;
        for (double i = 0; i <= inVal; i = i + 2){
            outVal = i + outVal;
        }

        System.out.println (MessageFormat.format("The sum of all the even numbers till {0} is : {1}",inVal, outVal));
    }
    public static void main (String... args){
        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("Input an integer: ");
        double input = inputScanner.nextLong();

        calculate(input);
    }
}
