/*
*  Lab2_12.java                                         Lab2_12
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/24/17
*
* Calculate the value of coins in a coin jar.
*/

import java.util.*;
import java.text.*;

public class Lab2_12 {

    private static void calculate (int quartersNum, int dimeNum, int cent5Num, int pennyNum){

        double totalValue = (quartersNum * 25) + (dimeNum * 10) + (cent5Num * 5) + pennyNum;
        
        double dollarValue = totalValue/100;
        
        System.out.println (MessageFormat.format("Your Coin Jar is worth ${0}", dollarValue));
    }

    public static void input () {

        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("CALCULATE THE SUM OF COINS IN A JAR: ");

        System.out.println ("Input the number of Quarters: ");
        int quartersNum = inputScanner.nextInt ();

        System.out.println ("Input the number of Dimes: ");
        int dimeNum = inputScanner.nextInt();

        System.out.println ("Input the number of Nickels: ");
        int cent5Num = inputScanner.nextInt();

        System.out.println ("Input Number of Pennies: ");
        int pennyNum = inputScanner.nextInt();

        calculate(quartersNum, dimeNum, cent5Num, pennyNum);
        
        inputScanner.close();
    }

    public static void main (String [] args) {
        input();
    }
}