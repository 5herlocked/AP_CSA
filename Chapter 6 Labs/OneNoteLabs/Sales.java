//Tracking the sales of salesmen
//author: Shardul VAidya(5herl0cked)
//Date: 12/12/17

import console.*;
import java.text.*;

public class Sales {
	public static void main (String... args){
		System.out.println ("This program tracks the sales of your Salespeople");
		final double SALESPEOPLE = Console.promptInt("Please enter the number of Salespeople you have:");
		int[] sales = new int[(int)SALESPEOPLE];
		int sum, maxSale = 0, minSale = 0;

		for (int i = 0; i < sales.length; i++) {
			sales[i] = Console.promptInt("Enter the sales for salesperson " + (i + 1) + ":");
			maxSale = (sales[i] > sales[maxSale]) ? i : maxSale;
			minSale = (sales[i] < sales[minSale]) ? i : minSale;
		}

		System.out.println ("\nSalesPerson\tSales");
		System.out.println ("----------------------");
		sum = 0;

		for (int i = 0; i < sales.length; i++) {
			System.out.println ((i + 1) + "\t\t" + Console.currencyFormat(sales[i]));
			sum += sales[i];
		}

		System.out.println ("\nTotal Sales: " + Console.currencyFormat(sum));
		System.out.println ("Average Sale: " + Console.currencyFormat(sum/SALESPEOPLE));
		System.out.println (MessageFormat.format("Salesperson {0} had the highest sale with {1}", maxSale + 1, Console.currencyFormat(sales[maxSale])));
		System.out.println (MessageFormat.format("Salesperson {0} had the lowest sale with {1}", minSale + 1, Console.currencyFormat(sales[minSale])));
		int compareTo = Console.promptInt("Please enter the value that your Salespeople should have exceded: ");
		int count = 0;
		
		for (int i = 0; i < sales.length; i++)
			if (sales[i] > compareTo){
				System.out.println (MessageFormat.format("Salesperson {0} had more than the target with a sale of {1}", i + 1, Console.currencyFormat(sales[i])));
				count++;
			}
		System.out.println ("There were " + count + " Salespeople who exceded your target of " + Console.currencyFormat(compareTo));
	}
}