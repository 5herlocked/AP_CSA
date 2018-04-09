/*
*  Salary.java											Salary
*
*  Author: Shardul Vaidya (5herlocked)                  Date:17/10/2017
*  
*  Computes the amount of a raise and the new salary for an 
*  employee.  The current salary and a performance rating
*  (a String: "Excellent", "Good", or "Poor") are input.
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main (String... args) {

		double currentSalary;  // employee's current  salary
		double raise;          // amount of the raise
		double newSalary;      // new salary for the employee
		String rating;         // performance rating
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the current salary: ");
		currentSalary = Double.parseDouble(scan.nextLine());
		System.out.print ("Enter the performance rating (Excellent, "  
		                  + " Good, or Poor): ");
		rating = scan.nextLine();

		// Compute the raise using if ...
		if(rating.equalsIgnoreCase("Excellent"))
			raise = currentSalary * 0.06;
		else if (rating.equalsIgnoreCase("Good"))
			raise = currentSalary * 0.04;
		else if (rating.equalsIgnoreCase("Poor"))
			raise = currentSalary * 0.015;
		else {
			raise = 0;
			System.out.println ("There is no need to enter invalid ratings!");
		}

		newSalary = currentSalary + raise;

		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary:       " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary:      " + money.format(newSalary));
	}
}