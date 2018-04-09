/*
*  BaseConvert.java                                     BaseConvert
*
*  Author: Shardul Vaidya (5herlocked)                  Date:14/09/2017
*
* Converts From one base to another.
*/

import java.util.*;
import java.text.*;

public class BaseConvert {

    private static Scanner inScan = new Scanner (System.in);
    
    private static void convert (int baseIn, int baseOut){
        System.out.println ("Please enter numerical input: ");
        Long rawInput = inScan.nextLong(baseIn);

        String outputNum = Long.toString(rawInput, baseOut);

        System.out.print (MessageFormat.format ("(base {0}) is {1} (base{2}).", baseIn, outputNum, baseOut));
    }
    
    public static void main (String...args){
        System.out.println ("This app converts numbers from any base to any base.");
                
        System.out.println ("Please enter input's base(#): ");
        int baseIn = inScan.nextInt();

        System.out.println ("Please enter the output base(#): ");
        int baseOut = inScan.nextInt();

        convert(baseIn, baseOut);
    }
}