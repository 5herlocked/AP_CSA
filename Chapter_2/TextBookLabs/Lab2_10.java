/*
*  Lab2_10.java                                         Lab2_10
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/23/17
*
* Calculates the Area using Herons Formula
*/
import java.util.*;
import java.lang.*;
import java.text.*;

public class Lab2_10 {

    private static Double area = 0.0d;
    private static Double s = 0.0d;

    private static void calculate (double a, double b, double c){

        s = (a + b + c) / 2;
        area = Math.sqrt(Math.abs(s*(s - a)*(s - b)*(s - c)));

    }

    public static void main (String... args){

        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("AREA OF TRIANGLE USING HERONS");

        System.out.println ("Enter the length of side 1: ");
        double a = inputScanner.nextDouble();

        System.out.println ("Enter the length of side 2: ");
        double b = inputScanner.nextDouble();

        System.out.println ("Enter the length of side 3: ");
        double c = inputScanner.nextDouble();

        DecimalFormat output = new DecimalFormat ("#.###");

        calculate(a, b, c);
        

        System.out.println (MessageFormat.format("You entered {0}, {1}, {2}. \n The Semiperimeter is {3} \n The Area is {4} ",a , b, c, s, area));
        inputScanner.close();
    }
}
