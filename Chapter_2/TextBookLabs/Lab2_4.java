/*
* Lab2_4.java                                           Lab2_4
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/22/17
*
*  Making an application that converts tempratures
*/

import java.util.Scanner;
import java.text.*;

public class Lab2_4 {

    private static Double outTemp = 0.0;

    private static void inputSeries() {
        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("TEMPRATURE CONVERTER");

        Double inTemp = 0.0;

        System.out.println ("Choose the start unit of Temprature (C/F/K): ");
        String tempratureUnit = inputScanner.next(); //accepts input and converts to upper case
        tempratureUnit = tempratureUnit.toUpperCase();

        System.out.println ("Choose the final unit of Temprature (C/F/K): ");
        String outputUnit = inputScanner.next(); // accepts temprature output unit and converts to upper case
        outputUnit.toUpperCase();

        System.out.println ("Type temperature input: "); //accepts the temprature value
        inTemp = inputScanner.nextDouble();

        outTemp = convert (inTemp, tempratureUnit, outputUnit);

        System.out.println (MessageFormat.format("You converted {0} {1} to {2} {3}.", inTemp, tempratureUnit, outTemp, outputUnit));
    }

    public static double convert (Double tempIn, String inUnit, String outUnit){ //does the calculations of conversions

        Double conversion_factor = 9.0 / 5.0;
        int convert_C_F = 32;
        Double convert_K_C = 273.15;

        if (inUnit.equals("C") && outUnit.equals("F")){ // Celsius to Farenheit
            outTemp = (tempIn * conversion_factor) + convert_C_F;
        } 
        else if (inUnit.equals("C") && outUnit.equals("K")) { //Celsius to Kelvin
            outTemp = tempIn + convert_K_C;
        }
        else if (inUnit.equals("F") && outUnit.equals("C")){ //Farenheit to Celsius
            outTemp = (tempIn - convert_C_F) * (1/conversion_factor);
        }
        else if (inUnit.equals("F") && outUnit.equals("K")){ //Farenheit to Kelvin
            outTemp = ((tempIn - convert_C_F) * (1/conversion_factor)) + convert_K_C;
        }
        else if (inUnit.equals("K") && outUnit.equals("C")){ //Kelvin to Celsius
            outTemp = tempIn - convert_K_C;
        }
        else if (inUnit.equals("K") && outUnit.equals("F")){ //Kelvin to Farenheit
            outTemp = ((tempIn - convert_K_C) * conversion_factor) + convert_C_F;
        }
        return outTemp;
    }

    
    public static void main (String...args) {
        inputSeries();
    }

}