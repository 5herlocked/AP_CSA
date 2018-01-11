/*
* Lab1_1.java                                           Lab1_1
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/17/17
*
* This lab is one of my first java lab which is meant to demonstrate errors and thier solutions. 
*/

public class Lab1_1 /* a)lab 1_1 - will lead to compile time error because Java doesn't accept class name's being in lowercase */
{
  public static void main (String[]args) {
    System.out.println ("This is an emergency Broadcast"); //b. This only changes the printout on screen.
    // c. removing the quotation will lead to the string being invalid and will lead to a compile time error.
    // d. removing the last quotation will lead to everthing after the removal being treated as a string and will lead to a compile error
    // e. will lead to a run time error because there won't be a main method to execute
    // f. there will be a compile time error because "bogus" isn't a java accepted word and there will be no printout
    // g. syntax error which will say "; expected on line"
    // h. The class is incomplete and will thus not execute
  }
}