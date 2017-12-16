/*
*  Lab3_2.java                                          Lab3_2 & Lab3_3
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/28/17
*
* Determine if the year input by the user is leap or not.
*/

import java.util.Scanner;

public class Lab3_2 {

    private static void calculate (int inYear){
            if (inYear < 1582)
                System.out.println ("This is before Leap Years existed.");
        
            else if (inYear % 4 == 0 && inYear % 400 == 0 && inYear % 100 == 0)
                System.out.println("This is a leap year.");
        
            else if (inYear % 4 == 0 && inYear % 100 == 0 && inYear % 400 != 0)
                System.out.println ("This is not a leap year.");
        
            else if (inYear % 4 == 0 && inYear != 0 && inYear % 400 != 0)
                System.out.println("This is a leap year.");

            else
                System.out.println ("This is not a leap year.");
    }

    public static void main (String... args){
        Scanner inYear = new Scanner (System.in);

        int yearIn;

        do {
        System.out.println("Please enter a year (####) (1 to exit): ");
        yearIn = inYear.nextInt();
        calculate(yearIn);
        } while (yearIn != 1);
    }
}