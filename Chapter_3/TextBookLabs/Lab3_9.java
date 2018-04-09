/*
*  Lab3_9.java                                          Lab3_9
*
*  Author: Shardul Vaidya (5herlocked)                  Date:9/12/17
*
*  Prints a certain number of verses of a song.
*/

import java.text.MessageFormat;
import java.util.*;

public class Lab3_9{

    private static void print (int num){
        for (int i = 0; i < num; i++ ){
            int inNum = 100 - i;
            System.out.println (MessageFormat.format("{0} bottles of beer on the wall" + "\n"+
                                                     "{0} bottles of beer" + "\n" +
                                                     "If one of the bottles should happen to fall",inNum));
        }
    }

    public static void main (String... args){
        Scanner inScan = new Scanner (System.in);
        System.out.println ("This application prints a certain number of verses of the travelling song: ");

        System.out.println ("Please input the number of verses you want printed: ");
        int numberOfVerses = inScan.nextInt();

        print (numberOfVerses);
        inScan.close();
    }
}