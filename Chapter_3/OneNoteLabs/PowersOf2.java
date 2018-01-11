/*
*  PowersOf2.java                                          PowersOf2
*
*  Author: Shardul Vaidya (5herlocked)                  Date:19/10/17
*
*  Writes a bunch of Powers of 2.
*/

import java.util.Scanner;

public class PowersOf2 {
	public static void main(String... args) {
		double numPowersOf2 = 0;
		double exponent = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many powers of 2 do you want?");
		try{
			numPowersOf2 = Double.parseDouble(scan.nextLine());
		} catch (NumberFormatException e){
			System.out.println ("BOI..... enter a real number");
			numPowersOf2 = 0;
		}

		System.out.println ("Number of Powers of 2 printed will be: " + numPowersOf2);
		double currentValue = 1;

		for (int i = 0; i < numPowersOf2; i++){
			currentValue *= 2;
			System.out.println (currentValue);
		}
   	}
}
