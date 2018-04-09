/*
* Lab2_6.java                                           Lab2_6
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/22/17
*
*  Making an application that converts time to different formats/units
*/

import java.util.Scanner;

public class Lab2_6 {

    private static final int conversionRate = 60;
    private static int outTime;

    private static void convert (int inHour, int inMinute, int inSeconds){

        outTime = inHour * conversionRate * conversionRate + 
                        inMinute * conversionRate + inSeconds;


        System.out.println ("There are " + outTime + " seconds" + "\n" + "In " + inHour + " hours " + inMinute 
                            + " minutes & " + inSeconds + "seconds");
    }

    private static void obtain () {

        int hourNum, minuteNum, secNum;

        Scanner inputScanner = new Scanner (System.in);

        System.out.println ("Type the number of hours to convert : ");
        hourNum = inputScanner.nextInt();

        System.out.println ("Type the number of minutes to convert : ");
        minuteNum = inputScanner.nextInt();

        System.out.println ("Type the number of seconds to convert : ");
        secNum = inputScanner.nextInt();

        convert (hourNum, minuteNum, secNum);

    }

    public static void main (String...args){
        obtain();
    }
}