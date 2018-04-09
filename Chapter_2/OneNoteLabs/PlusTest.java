/*
*  PlusTest.java                                        PlusTest
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/31/17
*
* Tests my knowledge of Plus.
*/

import java.util.Scanner;
import java.text.*;

public class PlusTest {

	public static void main (String...args){
		Scanner input = new Scanner (System.in);

		System.out.println ("THIS PROGRAM CALCULATES THE NUMBER OF BIRDS");

		System.out.println ("Input the number of Robins:");
		int robinNum = input.nextInt();

		System.out.println ("Input the number of Canaries:");
		int canaryNum = input.nextInt();

		System.out.println ( " " + robinNum + " Robins plus " + canaryNum + " Canaries is "+ (robinNum + canaryNum) +  " Birds");
	}
}