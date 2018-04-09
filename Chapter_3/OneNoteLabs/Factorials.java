/*
*  Factorials.java										Factorials
*
*  Author: Shardul Vaidya (5herlocked)                  Date:20/10/2017
*  
*  Computes Factorials of a number till a certain user defined number
*/

import java.util.*;
import java.text.*;

public class Factorials {
	public static void main (String... args){
		long res = 1;
		double finalFactorial = 0;
		Scanner inScan = new Scanner (System.in);
		int currentFac = 1;

		while (finalFactorial <= 0){
			System.out.println ("Please enter the number whose Factorial you wish to find");
			try {
				finalFactorial = Double.parseDouble(inScan.nextLine());
			} catch (NumberFormatException e){
				System.out.println ("BOI...... enter a real number");
			}
		}

		while (currentFac <= finalFactorial){
			res *= currentFac;
			currentFac++;
		}

		if (res == 0)
			System.out.println ("Factorial is too large for computation!");
		else
			System.out.println (MessageFormat.format("{0}! is {1}", finalFactorial, res));

		inScan.close();
	}
}