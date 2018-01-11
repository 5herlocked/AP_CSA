/*
*  Lab3_7.java                                          Lab3_7
*
*  Author: Shardul Vaidya (5herlocked)                  Date:9/11/17
*
*  Prints the squares of numbers from 1 to 12.
*/
import java.text.*;
import java.util.*;

public class Lab3_7{
    public static void main (String... args){
        List<Integer> operand1 = new ArrayList<Integer> ();
        List<Integer> operand2 = new ArrayList<Integer> ();

        for (Integer i = 1; i <= 12; i++){
            operand1.add(i);
            operand2.add(i);
        }

        for (int i = 0; i < operand1.size(); i++){
            System.out.println (MessageFormat.format("{0} x {1} = {2}", operand1.get(i), operand2.get(i), operand1.get(i)* operand2.get(i)));
        }
    }
}