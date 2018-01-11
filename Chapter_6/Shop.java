// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.*;
import console.*;

public class Shop {
	public static void main (String... args) {

		Item item;
		String itemName;
		double itemPrice;
		int quantity;
		double total = 0;
		List<Item> cart = new ArrayList<Item>();

		String keepShopping = "y";

		do {
			itemName = Console.promptString("Enter the name of the item: ");

			itemPrice = Console.promptDouble("Enter the unit price: ");

			quantity = Console.promptInt("Enter the quantity: ");

			// *** create a new item and add it to the cart
			item = new Item(itemName, itemPrice, quantity);
			cart.add(item);

			// *** print the contents of the cart object using println
			String contents = "\nShopping Cart\n" + "\nItem\t\tUnit Price\tQuantity\tTotal";
			System.out.println(contents);

			for (Item i : cart)
				System.out.println (i);

			keepShopping = Console.promptString("Continue shopping (y/n)? ");
		} while (keepShopping.equalsIgnoreCase("y"));

		for (Item i : cart) {
			total += i.getPrice()*i.getQuantity();
		}

		System.out.println("Please Pay: " + Console.currencyFormat(total));
	}
}
