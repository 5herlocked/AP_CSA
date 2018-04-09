/*
*  Count.java                                          Count
*
*  Author: Shardul Vaidya (5herlocked)                  Date:20/10/2017
*
*  Determine the number of vowels, consonents, punctuation marks and 
*  spaces in a String
*/

import java.util.*;
import java.text.*;

public class Count {

	private static void analyse (String input) {
		int a = 0;
		int e = 0;
		int s = 0;
		int t = 0;
		int punctuation = 0;
		int spaces = 0;

		for (Character c : input.toCharArray()){
			switch (c.toLowerCase(c)) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 's':
					s++;
					break;
				case 't':
					t++;
					break;
				case '.':
					punctuation++;
					break;
				case ',':
					punctuation++;
					break;
				case ';':
					punctuation++;
					break;
				case '\'':
					punctuation++;
					break;
				case '"':
					punctuation++;
					break;
				case ':':
					punctuation++;
					break;
				case '!':
					punctuation++;
					break;
				case '?':
					punctuation++;
					break;
				case '-':
					punctuation++;
					break;
				case ' ':
					spaces++;
					break;
			}
		}

		System.out.println("Number of \"a's\": " + a);
		System.out.println("Number of \"e's\": " + e);
		System.out.println("Number of \"s's\": " + s);
		System.out.println("Number of \"t's\": " + t);
		System.out.println("Number of \"spaces's\": " + spaces);
		System.out.println("Number of \"punctuation's\": " + punctuation);
	}

	public static void main (String... args){
		Scanner inScan = new Scanner (System.in);

		System.out.println ("This program determines the number of vowels, consonents, punctuation marks and spaces in a String.");
		String another = "y";

		while (another.equalsIgnoreCase("y")){
			System.out.println ();

			System.out.println ("Please enter a sentence.");
			String usrInput = inScan.nextLine();

			analyse (usrInput);

			System.out.println ("Do you want to try another phrase? (Y/N)");
			another = inScan.nextLine();
		}

		System.out.println ("Come back later!");
	}
}