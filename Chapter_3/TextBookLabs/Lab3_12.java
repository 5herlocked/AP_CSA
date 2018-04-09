/*
*  Lab3_12.java                                          Lab3_12
*
*  Author: Shardul Vaidya (5herlocked)                  Date:04/10/17
*
*  Create patterns using loops.
*/

import java.util.*;
import java.text.*;

public class Lab3_12{
	public static void main (String... args){
		Scanner inScan = new Scanner (System.in);
		String another = "y";
		while (another.equalsIgnoreCase("y")){
			System.out.println ("Please enter the pattern that you want to print (a/b/c/d).");
			String option = inScan.nextLine();

			switch (option.toLowerCase()){
				case "a":
				Patterns.a();
				break;
				case "b":
				Patterns.b();
				break;
				case "c":
				Patterns.c();
				break;
				case "d":
				Patterns.d();
				break;
			}
			System.out.println("Do you want to print another pattern? (y/n)");
			another = inScan.nextLine();
		}
	}
}


/*
	private static void a (){
		String master = "**********         ";
		for (int i = 0; i < 10; i++)
	 		System.out.println (master.substring(i, master.length()/2 + i + 1));
 	}

 	private static void b (){
		String master = "         **********";
		for (int i = 0; i < 10; i++)
			System.out.println (master.substring(i, master.length()/2 + i + 1));
	}

 	private static void c (){
		String master = "          **********";
		for (int i = 10; i >= 0; i--)
			System.out.println (master.substring(i, master.length()/2 + i));
 	}

 	private static void d (){
		String master1 = "    *********";
		String master2 = "     **********";
		for (int i = 0; i < 5; i++) 
			System.out.println(master1.substring(i, 5 + 2 * i));
		for (int i = 5; i > 0; i--)
			System.out.println(master2.substring(i - 1, master2.length()/3 + (2 * i) - 3));
 	}
*/