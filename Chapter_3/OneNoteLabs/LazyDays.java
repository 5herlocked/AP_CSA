/*
*  Activities.java										Activites
*
*  Author: Shardul Vaidya (5herlocked)                  Date:17/10/2017
*
*  Suggests activites based on the temprature of the day.
*/

import java.util.*;
import java.text.*;

public class LazyDays {
	public static void main (String... args){

		double temprature = 0;
		String suggestion = "";
		Scanner inscan = new Scanner (System.in);

		System.out.println ("Welcome to the Suggestion booth at the Lake Lazy Days Resort!");

		System.out.println ("Please enter the temprature outside: ");
		try {
			temprature = inscan.nextDouble();
		} catch (InputMismatchException e){
			System.out.println ("BOI..... please enter a real number!");
			System.exit(1);
		}

		if (temprature >= 95 || temprature <= 20)
			suggestion = "Shop";
		else if (temprature >= 80)
			suggestion = "Swimming Pools";
		else if (temprature >= 60)
			suggestion = "Tennis Courts";
		else if (temprature >= 40)
			suggestion = "Golf Course";
		else if (temprature < 40 && temprature > 20)
			suggestion = "Skiing Hill";

		System.out.println ("Please visit our " + suggestion);
	}
}