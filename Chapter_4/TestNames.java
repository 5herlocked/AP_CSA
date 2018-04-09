]//Runner class for Class Name.java
//@author: Shardul Vaidya (5herl0cked)
//Date: November 18, 2017

import java.util.*;
import java.text.*;
import console.*;

public class TestNames {
	public static void main (String ... args) {
		Name name1 = new Name (Console.promptString("Enter the First Name of Person 1: "), Console.promptString("Enter the Middle Name of Person 1:"), Console.promptString("Enter the Last Name of Person 1:"));
		Name name2 = new Name (Console.promptString("Enter the First Name of Person 2: "), Console.promptString("Enter the Middle Name of Person 2:"), Console.promptString("Enter the Last Name of Person 2:"));

		System.out.println ("Name 1: " + name1.firstMiddleLast());
		System.out.println ("Name 2: " + name2.firstMiddleLast());

		System.out.println ("Name 1: " + name1.lastFirstMiddle());
		System.out.println ("Name 2: " + name2.lastFirstMiddle());

		System.out.println ("Name 1's initials are: " + name1.initials());
		System.out.println ("Name 2's initials are: " + name2.initials());

		System.out.println ("Name 1's length is: " + name1.length() + " letters long");
		System.out.println ("Name 2's length is: " + name2.length() + " letters long");
		
		/*
		switch (Console.promptString("What name do you want to compare to (1/2)?")) {
			case "1":
				System.out.println (name1.compare(Console.promptString("Please enter a name to compare to: ")));
				break;
			case "2":
				System.out.println (name2.compare(Console.promptString("Please enter a name to compare to: ")));
				break;
		}
		*/

		System.out.println (name1.compare(name2.firstMiddleLast()));
		System.out.println (name2.compare(name1.firstMiddleLast()));
	}
}