/*
*  Temps.java											Temps
*
*  Author: Shardul Vaidya (5herlocked)                  Date:21/10/2017
*  
*  This program reads a sequence of hourly temprature readings and prints
*  the max temp. and the min temp.
*/

import java.util.*;
import java.text.*;

public class Temps {
	public static void main (String... args){
		final int HOURS_PER_DAY = 4;
		long minTemp = Long.MAX_VALUE;
		long maxTemp = Long.MIN_VALUE;
		int minHour = 0;
		int maxHour = 0;
		Scanner inScan = new Scanner(System.in);

		System.out.println ();
		System.out.println ("Temprature Readings for a 24 Hour Periods");
		System.out.println ();

		for (int hour = 0; hour < HOURS_PER_DAY; hour++){
			System.out.println ("Enter the Temprature reading at " + hour + " hours: ");
			long temp;
			
			try {
				temp = Long.parseLong (inScan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println ("BOI...... Please enter a real tempreture.");
				temp = 0;
			}
			
			if (temp < minTemp){
				minTemp = temp;
				minHour = hour;
			}
			else if (temp > maxTemp){
				maxTemp = temp;
				maxHour = hour;
			}
		}
		
		DecimalFormat time = new DecimalFormat ("00");

		System.out.println (MessageFormat.format("The maximum Temprature in the day was {0} at {1}00 hours."
		                                         , maxTemp, time.format(maxHour)));
		System.out.println (MessageFormat.format("The minimum temprature in the day was {0} at {1}00 hours."
		                                         , minTemp, time.format(minHour)));
	}
}