/*
*  Lab2_13.java                                         Lab2_13
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/25/17
*
* Generates a Random Phone Numbers
*/

import java.text.*;

public class Lab2_13 {
  
  private static void generate (){
    
    //Random createNum = new Random ();
    
    int num1 = (int) (Math.random() * 7) + 1; //createNum.nextInt(8);
    int num2 = (int) (Math.random() * 7) + 1; //createNum.nextInt(8);
    int num3 = (int) (Math.random() * 7) + 1; //createNum.nextInt(8);
    
    int middle3 = (int) (Math.random() * 743); //createNum.nextInt(742);
    
    int last4 = (int) (Math.random() * 10000); //createNum.nextInt(9999);
    
    concatenate (num1, num2, num3, middle3, last4);
  }
  
  private static void concatenate (int num1, int num2, int num3, int middle3, int last4){

    DecimalFormat formatMiddle = new DecimalFormat ("000");
    DecimalFormat formatLast = new DecimalFormat ("0000");
  
    //String formattedMiddle3 = String.format ("%03d",middle3);
    //String formattedLast4 = String.format ("%04d", last4);

    String formattedMiddle3 = formatMiddle.format (middle3);
    String formattedLast4 = formatLast.format (last4);

    System.out.println (MessageFormat.format("The random number is: {0}{1}{2}-{3}-{4}", num1, num2, num3, formattedMiddle3, formattedLast4));
  
  }
  
  public static void main (String...args){
    for (int i = 0; i < 10; i++)
      generate ();
  }
}