/*
*  LoveCS.java                                          LoveCS
*
*  Author: Shardul Vaidya (5herlocked)                  Date:19/10/17
*
*  Writes I love computer Science using a Loop
*/

import java.util.*;
import java.text.*;

public class LoveCS {
	public static void main (String... args){
		Scanner inScan = new Scanner (System.in);

		int sum = 0;
		int finalCount = 0;
		while (finalCount == 0){
			System.out.println ("Please enter the number of times you " +
					"would like to print \"I love Computer Science!\"");
			try{
				finalCount = Integer.parseInt(inScan.nextLine());
			}
			catch (NumberFormatException e){
				System.out.println ("BOI.... Please enter a legit Number!");	
			}
		}

		for (int i = 0; i <= finalCount; i++){
			System.out.println (MessageFormat.format("{0} I Love Computer Science !", i));
			sum += i;
		}

		System.out.println (MessageFormat.format("Printed the message {0} times. The sum " +
									"of the numbers from 1 to {0} is {1}", finalCount, sum));
	}
}