w//BandBooster Pristine Class
//@author: Shardul Vaidya (5herl0cked)
//Date: November 15, 2017

import java.util.*;
import console.*;

public class BandBooster {
	private Scanner inScan = new Scanner (System.in);
	private int boxesSold = 0;
	private String name = "";

	public BandBooster (String inName) {
		name = inName;
		boxesSold = 0;
	}

	public String getName () {
		return name;
	}

	public void updateSales (int plusBoxes) {
		boxesSold += plusBoxes;
	}

	public String toString () {
		return name + " : " + boxesSold + " Boxes Sold";
	}
}