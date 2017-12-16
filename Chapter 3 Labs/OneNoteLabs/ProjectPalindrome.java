/*
*  ProjectPalindrome.java                               ProjectPalindrome
*
*  Author: Shardul Vaidya (5herlocked)                  Date:22/10/17
*
*  Test for a palindrome irrespective of punctuations.
*/
import console.*;
import java.util.*;

public class ProjectPalindrome{

	private static void check (String str){
		/*
		List<Character> strMod = new ArrayList<>();
		List<Character> reverseMod = new ArrayList<>();

		for (Character c : str.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				strMod.add(c.toLowerCase(c));
				reverseMod.add(c.toLowerCase(c));
			}
		}
		Collections.reverse(reverseMod);
		
		if (strMod.equals(reverseMod))
			System.out.println ("This string is a Palindrome");
		else
			System.out.println ("This string is not a Palindrome");
		*/	
		
		String str1 = str.replaceAll("[^a-zA-Z/d]", "").toLowerCase();

		String str2 = new StringBuilder(str1).reverse().toString();
		
		if (str1.equals(str2))
			System.out.println ("This string is a Palindrome");
		else
			System.out.println ("This string is not a Palindrome");
	
	}

	public static void main (String... args){
		
		String str, another = "y";
		int left, right, count = 0;

		Scanner input = new Scanner (System.in);

		while (another.equalsIgnoreCase("y")){
			System.out.println ("Enter a potential Palindrome:");
			str = input.nextLine();

			check (str);
			count++;

			System.out.println ("");

			another = Console.promptString("Do you want to test another Palindrome? (Y/N)");
		}

		System.out.println ("You tested " + count + " Palindromes.");
	} 
}