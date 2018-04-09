/*
*  Circle3.java                                          Circle3
*
*  Author: Shardul Vaidya (5herlocked)                  Date:09/07/17
*
* Determine the Area and Circunference of a Circle with an input radius.
*/

import java.text.*;
import java.util.*;

public class Circle3 {
    private static double calculateArea (double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    private static double calculateCircum (double radius){
        double circum = Math.PI * 2 * radius;
        return circum;
    }
    public static void main (String...args){
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < 2; i++ ){
            System.out.println ("Input the Radius of the circle: ");
            double rad = scan.nextDouble();
    
            double area = calculateArea(rad);
            double circum = calculateCircum(rad);
    
            System.out.println(MessageFormat.format("You input {0} units radius \n" +
                                                    " The Area is: {1} unit squared \n" +
                                                    " The circumference is {2} unit squared." , rad, area, circum));
        
        }
    }
}