/*
*  Lab2_9.java                                          Lab2_9
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/23/17
*
* Calculates the Volume and the Surface Area of a Sphere
*/

import java.lang.*;
import java.util.*;
import java.text.*;

public class Lab2_9 {

    private static final Double multiplicationFactor = 4 / 3d; 
    private static Double answers [] = new Double [2];
    private static Double volume;
    private static Double surfaceArea;

    private static void calculate (Double rad){

        DecimalFormat output = new DecimalFormat ("#.####");

        volume = Math.PI * Math.pow (rad,3) * multiplicationFactor;

        surfaceArea = Math.PI * Math.pow (rad, 2) * multiplicationFactor * 3.0d;
        
        answers [0] = Double.parseDouble(output.format (volume));
        answers [1] = Double.parseDouble(output.format(surfaceArea));
    }

    public static void main (String...args){

        Scanner radScanner = new Scanner (System.in);

        System.out.println ("Calculate the Surface Area and Volume of a Sphere");

        System.out.println ("Please enter the Radius of the sphere");
        double radius = radScanner.nextDouble();

        calculate (radius);

        System.out.println (MessageFormat.format("You entered the radius: {0} \n"
                            +  "The Volume is: {1} \n" 
                            + "The Surface Area is: {2}", radius, volume, surfaceArea));
        radScanner.close();
    }
}
