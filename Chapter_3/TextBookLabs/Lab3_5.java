/*
*  Lab3_5.java                                          Lab3_5
*
*  Author: Shardul Vaidya (5herlocked)                  Date:9/11/17
*
*  Prints a sentence one character per line
*/

import java.util.*;
import java.text.*;

public class Lab3_5{
    public static void main (String... args){
        Scanner inScan = new Scanner (System.in);
        System.out.println ("Please enter a Line: ");
        
        String input = inScan.nextLine();
        char [] toPrint = input.toCharArray();
        
        /*
        for (int i = 0; i < toPrint.length; i++){
            System.out.println (toPrint[i]);
        }
        */
        
        for (Character c : toPrint)
            System.out.println(c);

        inScan.close();
    }
}