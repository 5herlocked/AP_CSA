//recursive palindrome testing
import console.*;

public class Palindrome {
	public static boolean analyse (String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;

		if (s.charAt(0) == s.charAt(s.length() - 1))
			return analyse(s.substring(1, s.length()-1));

		return false;
	}

	public static void main(String... args) {
		do {
			System.out.println(analyse(Console.promptString("What Palindrome do you want to test?")) ? "is Palindrome" : "isn't Palindrome");
		}
		while (Console.promptString("Do you want to test another palindrome?").equalsIgnoreCase("y"));
	}
}