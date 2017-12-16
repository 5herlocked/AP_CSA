/*
* Lab2_2.java                                           Lab2_2
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/18/17
*
*  Making an application that reads 3 numbers and then prints thier average.
*/

import java.text.MessageFormat;
import java.util.Scanner;
public class Lab2_2 {
  public static void main (String...args){
    
    Scanner numbScanner = new Scanner (System.in); 
    
    System.out.println ("Enter a Number: ");
    int num1 = numbScanner.nextInt();
    
    System.out.println ("Enter a Number: ");
    int num2 = numbScanner.nextInt();    

    System.out.println ("Enter a Number: ");
    int num3 = numbScanner.nextInt();

    System.out.println (MessageFormat.format()"You have selected : {0}, {1}, {2}. ", num1, num2, num3));
    int avgNum = (num1 + num2 + num3)/3d ;

    System.out.println ("The Average is: " + avgNum);
  }
}