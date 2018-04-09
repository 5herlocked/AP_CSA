//This class simulates a users shopping experience
//author: Shardul Vaidya (5herl0cked)
//Date: 02/01/2018

import console.*;
import java.text.*;

public class Shopping {
	public static void main (String ... args) {
		String another = "";
		ShoppingCart cart = new ShoppingCart ();
		do {
			cart.addToCart (Console.promptString("Please enter the name of the item: "), Console.promptDouble("Please enter the price of the item: "), Console.promptInt("Please enter the quantity of the item: "));
			System.out.println (cart);
			another = Console.promptString("Do you want to continue shopping?");
		} while(another.equalsIgnoreCase("y"));
		
		System.out.println ("Please pay " + Console.currencyFormat(cart.getPrice()));
	}
}