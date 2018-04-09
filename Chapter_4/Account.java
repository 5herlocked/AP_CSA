//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
import console.*;
import java.util.*;
import java.text.*;

public class Account {
	private double balance;
	private String name;
	private long acctNum;

	//----------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//----------------------------------------------
	public Account(double initBal, String owner, long number) {
		balance = initBal;
		name = owner;
		acctNum = number;
	}

	//----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//----------------------------------------------
	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println(MessageFormat.format("Insufficient funds in {0}s account", name));
	}

	//----------------------------------------------
	// Adds deposit amount to balance.
	//----------------------------------------------
	public void deposit(double amount) {
		balance += amount;
		System.out.println (MessageFormat.format("You have deposited {0} to {1}s account. So, the total balance is {2}", Console.currencyFormat(amount), name, Console.currencyFormat(balance)));
	}

	//----------------------------------------------
	// Returns balance.
	//----------------------------------------------
	public double getBalance() {
		System.out.println (MessageFormat.format("{0} balance is: {1}", name, Console.currencyFormat(balance)));
		return balance;
	}

	//----------------------------------------------
	// Deducts $10 service fee
	//----------------------------------------------
	public void chargeFee() {
		balance -= 10;
		System.out.println (MessageFormat.format("{0}s balance after charging the $10 fee is: {1}", name, Console.currencyFormat(balance)));
	}

	//----------------------------------------------
	// Changes the name on the account
	//----------------------------------------------
	public void changeName(String newName) {
		System.out.println (MessageFormat.format("{0}s name has been changed to {1}", name, newName));
		name = newName;
	}

	//----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//----------------------------------------------
	public String toString() {
		return "Name: " + name + "\t\tAccount Number: " + acctNum + " \t\tBalance: " + Console.currencyFormat(balance);
	}
}
