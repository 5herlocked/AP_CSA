/*
*  Lab3_6.java                                          Lab3_6
*
*  Author: Shardul Vaidya (5herlocked)                  Date:9/11/17
*
*  Determines and prints the number of odd, even and zeros in a number.
*/

import java.util.*;
import java.text.*;

public class Lab3_6{
    public static void main (String... args){
        Scanner inScan = new Scanner (System.in);

        System.out.println ("This application prints the number of even, odd, and zero digits in a number. ");

        System.out.println ("Please input an integer: ");
        String input = inScan.nextLine();


        List<Integer> toPrint = new ArrayList<Integer> ();
        for (int i = 0; i < input.length(); i++){
            toPrint.add(Character.getNumericValue(input.charAt(i)));
        }

        int numberOfZeros = 0, numberOfEvens = 0, numberofOdds = 0;
        
        for (int i = 0; i < toPrint.size(); i++){
            if (toPrint.get(i).equals(0)){
                numberOfZeros++;
            }
            else if (toPrint.get(i) % 2 == 0){
                numberOfEvens++;
            }
            else if (toPrint.get(i) % 2 == 1){
                numberofOdds++;
            }
        }
        
        System.out.println (MessageFormat.format("In {0} there are {1} even digits, {2} odd digits and {3} zeros.", input, numberOfEvens, 
                                                    numberofOdds, numberOfZeros));
        inScan.close();
    }
}