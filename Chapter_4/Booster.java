//Booster Class for BandBooster
//@author: Shardul Vaidya (5herl0cked)
//Date: November 15, 2017

import java.util.*;
import java.text.*;
import console.*;

public class Booster {
	final private static int NUMBER_OF_WEEKS = 3;

	public static void main (String... args) {
		BandBooster booster1 = new BandBooster (Console.promptString("Please enter the 1st Boosters Name: "));

		for (int i = 1; i <= NUMBER_OF_WEEKS; i++)
			booster1.updateSales (Console.promptInt("Enter the number of Boxes sold by " + booster1.getName() + " week " + i + " :"));

		System.out.println ();
		BandBooster booster2 = new BandBooster (Console.promptString("Please enter the 2nd Boosters Name: "));

		for (int i = 1; i <= NUMBER_OF_WEEKS; i++)
			booster2.updateSales (Console.promptInt("Enter the number of Boxes sold by " + booster2.getName() + " week " + i + " :"));

		System.out.println (booster1);
		System.out.println (booster2);
	}
}