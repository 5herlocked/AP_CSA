/*
*  Weight.java                                          Weight
*
*  Author: Shardul Vaidya (5herlocked)                  Date:09/08/2017
*
* Computes the ideal weight for men and wamen.
*/

import java.util.*;
import java.text.*;

public class Weight{
        
    private static String[] height = new String[2]; 
    private static int[] heightProcess = new int[2];

    private static double calcWeightWamen (){

        double idealWeight = 0;

        for (int i = 0; i < height.length; i++){
            heightProcess[i] = Integer.parseInt(height[i]);
        }

        if (heightProcess[0] == 5) {
            int feet = 0;
            int inches = heightProcess[1];
            System.out.println (feet);
            idealWeight = 100 + 5 * (inches + 12 * feet);
        }
        else if (heightProcess[0] != 5){
            int feet = heightProcess[0] - 5;
            System.out.println (feet);
            int inches = heightProcess[1];
            idealWeight = 100 + 5 * (inches + 12 * feet);
        }
        return idealWeight;
    }
    private static double calcWeightMen (){

        double idealWeight = 0;
        
        for (int i = 0; i < height.length; i++){
            heightProcess[i] = Integer.parseInt(height[i]);
        }
        
        if (heightProcess[0] == 5) {
            int feet = 0;
            System.out.println (feet);
            int inches = heightProcess[1];
            idealWeight = 106 + 6 * (inches + 12 * feet);
        }
        else if (heightProcess[0] != 5){
            int feet = heightProcess[0] - 5;
            System.out.println (feet);
            int inches = heightProcess[1];
            idealWeight = 106 + 6 * (inches + 12 * feet);
        }
        return idealWeight;
    }
    public static void main (String...args){
        Scanner inScan = new Scanner (System.in);
        System.out.println("This program calculates the ideal weight for you: ");

        System.out.println ("Please enter your sex (M/F): ");
        String sex = inScan.nextLine().toLowerCase();

        double printWeight = 0;
        double actualWeight = 0;
        
        if (sex.equals("m")){
            System.out.println ("Enter your height (feet, inches): ");
            String heightIn = inScan.nextLine();

            System.out.println ("Enter your weight(lbs): ");
            actualWeight = inScan.nextDouble();

            height = heightIn.split(",");
            printWeight = calcWeightMen();
        }
        else if (sex.equals("f")){
            System.out.println ("Enter your height (feet, inches): ");
            String heightIn = inScan.nextLine();

            System.out.println ("Enter your weight(lbs): ");
            actualWeight = inScan.nextDouble();

            height = heightIn.split(",");
            printWeight = calcWeightWamen();
        }
        if (printWeight <= actualWeight + (actualWeight * 0.15) && printWeight >= actualWeight - (actualWeight * 0.15)){
            System.out.println("You are in the ideal weight range.");
        }
        else {
            System.out.println ("You are outside the ideal weight range.");
        }
        
        System.out.println (MessageFormat.format("Your ideal weight is: {0} lbs.", printWeight));
        inScan.close();
    }
}