/*
*  Lab3_11.java                                          Lab3_11
*
*  Author: Shardul Vaidya (5herlocked)                  Date:04/10/17
*
*  Test for a palindrome irrespective of punctuations.
*/

import java.util.*;

public class Lab3_11{

	public static void check (String str){

		List<Character> strMod = new ArrayList<>();
		List<Character> reverseMod = new ArrayList<>();

		for (char c : str.toCharArray()){
			if (Character.isLetterOrDigit(c)){
				strMod.add(c);
				reverseMod.add(c);
			}
		}

		Collections.reverse(reverseMod);

		if (strMod.equals(reverseMod))
			System.out.println ("This string is a Palindrome");
		else
			System.out.println ("This string is not a Palindrome");

		/*
		left = 0;
		right = strMod.length() - 1; 

		while (strMod.charAt(left) == strMod.charAt(right) && left < right){
			left++;
			right--;
		}

		if (left < right)
			System.out.println ("This string is not a Palindrome");
		else
			System.out.println ("This string is a Palindrome");
		*/
	}

	public static void main (String... args){
		
		String str, another = "y";
		int left, right;

		Scanner input = new Scanner (System.in);

		while (another.equalsIgnoreCase("y")){
			System.out.println ("Enter a potential Palindrome");
			str = input.nextLine();

			check (str);

			System.out.println ("");

			System.out.println ("Do you want to test another Palindrome? (Y/N)");
			another = input.nextLine();
		}
	} 
}