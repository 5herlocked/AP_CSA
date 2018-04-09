/*
*  Lab3_13.java                                          Lab3_13
*
*  Author: Shardul Vaidya (5herlocked)                  Date:09/10/2017
*
*  Determine the number of vowels, consonents, punctuation marks and 
*  spaces in a String
*/

import java.util.*;
import java.text.*;

public class Lab3_13 {

	private static void analyse (String input) {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
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
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
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

		int consonents = input.length() - punctuation - (a+e+i+o+u) - spaces;

		System.out.println("Number of \"a's\": " + a);
		System.out.println("Number of \"e's\": " + e);
		System.out.println("Number of \"i's\": " + i);
		System.out.println("Number of \"o's\": " + o);
		System.out.println("Number of \"u's\": " + u);
		System.out.println("Number of \"spaces's\": " + spaces);
		System.out.println("Number of \"punctuation's\": " + punctuation);
		System.out.println("Number of \"consonents's\": " + consonents);

	}

	public static void main (String... args){
		Scanner inScan = new Scanner (System.in);

		System.out.println ("This program determines the number of vowels, consonents, punctuation marks and spaces in a String.");
		System.out.println ();
		System.out.println ("Please enter a sentence.");
		String usrInput = inScan.nextLine();

		analyse (usrInput);
	}
}