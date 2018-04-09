/*
* Lab2_3.java                                           Lab2_3
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/19/17
*
*  Making an application that reads 2 floats and finds their sum, difference and product
*/

import java.util.Scanner;

public class Lab2_3 {

    public static double calculateSum (double sum1, double sum2){
        double sum = sum1 + sum2;        
        return sum;
    }
    public static double calculateDifference (double diff1, double diff2){
        double difference = diff2 - diff1;        
        return difference;
    }
    public static double calculateProduct (double times1, double times2){
        double product = times1 * times2;        
        return product;
    }
    
    public static double calculateDivision (double divide1, double divide2){
        double divide = divide2 / divide1;
        return divide;
    }

    public static void main (String...args){
        Scanner doubleScanner = new Scanner (System.in);

        System.out.println ("Enter one decimal:");
        Double num1 = doubleScanner.nextDouble();
        
        System.out.println ("Enter one more decimal:");
        Double num2 = doubleScanner.nextDouble();

        System.out.println ("You have selected: " + num1 + ", " + num2 + ".");
        
        calculateSum(num1 , num2);
        calculateDifference(num1, num2);
        calculateProduct(num1, num2);
        calculateDivision(num1, num2); 

        System.out.println ("The Sum is : " + calculateSum(num1, num2) );
        System.out.println ("The difference is: " + calculateDifference(num1, num2));
        System.out.println ("The Product is: " + calculateProduct(num1, num2));
        System.out.println ("The division is: " + calculateDivision(num1, num2));

    }
}