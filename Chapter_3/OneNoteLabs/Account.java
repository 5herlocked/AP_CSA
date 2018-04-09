/*
*  Account.java											Account
*
*  Author: Shardul Vaidya (5herlocked)                  Date:17/10/2017
*  
*  Computes the total charge on a credit card
*/

import java.util.*;
import java.text.*;

public class Account {

	public static void main (String... args) {

		double previousBalance = 0;
		double additionalCharges = 0;
		double interest, newBalance, minimumPayment;
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the Previous Balance: ");

		try {
			previousBalance = scan.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println ("Please enter a valid number!");
			System.exit(-1);
		}

		System.out.print ("Enter the Additional Charges:");

		try {
			additionalCharges = scan.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println ("Please enter a valid number!");
			System.exit(-1);
		}

		newBalance = previousBalance + additionalCharges;

		if (previousBalance < 0) {
			System.out.println ("Please enter a valid previous Balance!");
			interest = 0;
		}
		else if (previousBalance == 0)
			interest = 0;
		else
			interest = newBalance * 0.02;

		newBalance += interest;

		if (newBalance <= 300 && newBalance >= 50)
			minimumPayment = 50;
		else if (newBalance > 300)
			minimumPayment = newBalance * 0.2;
		else if (newBalance < 50)
			minimumPayment = newBalance;
		else {
			minimumPayment = 0;
			System.out.println ("There is no need to enter invalid balances!");
		}

		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Previous Balance:     " + money.format(previousBalance));
		System.out.println("Additional Charges:   " + money.format(additionalCharges));
		System.out.println("Interest:             " + money.format(interest));
		System.out.println("New Balance:          " + money.format(newBalance));
		System.out.println("Minimum Payment:      " + money.format(minimumPayment));
	}
}