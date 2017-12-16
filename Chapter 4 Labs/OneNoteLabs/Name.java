//Name Pristine Class for the stuff
//@author: Shardul Vaidya (5herl0cked)
//Date: November 18, 2017

import java.util.*;
import java.text.*;
import console.*;

public class Name {
	private Scanner inScan = new Scanner (System.in);
	private String name;
	private String formattedName;
	private String firstName;
	private String middleName;
	private String lastName;

	public Name (String first, String middle, String last) {
		name = first + middle + last;
		formattedName = MessageFormat.format("{0} {1} {2}", first, middle, last);

		firstName = first;
		middleName = middle;
		lastName = last;
	}

	public String getFirst () {
		return firstName;
	}

	public String getMiddle () {
		return middleName;
	}

	public String getLast () {
		return lastName;
	}
	public String getName () {
		return name;
	}

	public String firstMiddleLast() {
		return formattedName;
	}


	public String lastFirstMiddle () {
		return MessageFormat.format("{2}, {0} {1}", firstName, middleName, lastName);
	}

	public String compare (String otherName) {
		return "The names " + formattedName + ", " + otherName + " are " + (otherName.equalsIgnoreCase(formattedName) ? " the same." : " not the same.");
	}

	public String initials () {
		return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(middleName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
	}

	public int length() {
		return name.length();
	}
}