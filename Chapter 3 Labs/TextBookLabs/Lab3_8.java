/*
*  Lab3_8.java                                          Lab3_8
*
*  Author: Shardul Vaidya (5herlocked)                  Date:9/11/17
*
*  Prints from 1 to a certain limit.
*/
import java.text.*;

public class Lab3_8{
    private static final int LIMIT = 5;

    public static void main (String... args){
        int count = 0;
        do {
            count++;
            System.out.println (count);
        }while (count < LIMIT);

        System.out.println ("Done!");
    }
}