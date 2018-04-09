/*
* Lab2_5.java                                           Lab2_5
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/22/17
*
*  Making an application that converts distances
*/

import java.util.*;
import java.text.*;

public class Lab2_5 {
    private static Double inDist = 0.0d;
    private static Double outDist = 0.0d;
    private static Boolean error = false;

    private static Double convert (String inUnit, Double inDistance) {
        Double conversion_factor_K_M = 0.6214;
        Double conversion_factor_M_K = 1.61;
        
        if (inUnit.equals("m")){
            outDist = inDistance * conversion_factor_M_K;
            return outDist;
        } else if (inUnit.equals("k")){
            outDist = inDistance * conversion_factor_K_M;
            return outDist;
        } else {
            error = true;
        }
        return outDist;
    }

    public static void main (String...args){
        
        Scanner inputVal = new Scanner (System.in);
        
        System.out.println ("What unit do you want to convert from (M/K)? : ");
        String unitIn = inputVal.nextLine();
        unitIn = unitIn.toLowerCase();
        
        System.out.println ("What is the distance that you want to convert?: ");
        inDist = inputVal.nextDouble();
        
        String unitOut;

        convert (unitIn, inDist);

        if (unitIn.equals("k")){
            unitOut = "miles";
        } else {
            unitOut = "kilometers";
        }

       if (error){
            System.out.println ("Input Error");
        } else {
            System.out.println (MessageFormat.format("{0} {1} = {2} {3}", inDist, unitIn, convert(unitIn, inDist), unitOut));
            //System.out.println (convert(unitIn, unitOut) + " " + unitIn + " = " + outDist + unitOut);
        }
    }    
}