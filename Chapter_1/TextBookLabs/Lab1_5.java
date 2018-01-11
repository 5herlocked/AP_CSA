/*
* Lab1_5.java                                           Lab1_5
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/17/17
*
*  Making a pretty little diamond with asterixes
*/

public class Lab1_5 {
  public static void main (String [] args){
  
    for (int i = 0; i < 5; i++) 
          System.out.println("    *********".substring(i, 5 + 2*i));

    for (int i =5; i>0;i--)
        System.out.println("     **********".substring(i-1,5+(2*i)-3));
    /*  
    System.out.println ("       *        ");
    System.out.println ("      ***       ");
    System.out.println ("     *****      ");
    System.out.println ("    *******     ");
    System.out.println ("   *********    ");
    System.out.println ("    *******     ");
    System.out.println ("     *****      ");
    System.out.println ("      ***       ");
    System.out.println ("       *        ");
    */

  }
}
