//This is my personal set of Methods to make programming easier for me
//@author: 5herl0cked
package console;

import java.util.*;
import java.text.*;

public class Console {
	private static Scanner inScan = new Scanner (System.in);

	public static int promptInt (String prompt) {
		System.out.println (prompt);
		return Integer.parseInt(inScan.nextLine());
	}

	public static double promptDouble (String prompt) {
		System.out.println (prompt);
		return Double.parseDouble(inScan.nextLine());
	}

	public static String promptString (String prompt) {
		System.out.println (prompt);
		return inScan.nextLine();
	}

	public static double format (double input, String format) {
		DecimalFormat nf = new DecimalFormat (format);
		return Double.parseDouble(nf.format(input));
	}

	public static String currencyFormat (double input) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(input);
	}
}