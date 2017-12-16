/*
*  Lab3_15.java                                          Lab3_15
*
*  Author: Shardul Vaidya (5herlocked)                  Date:17/10/2017
*
*  Slot Machine Simulator
*/

import java.util.*;
import java.text.*;

public class Lab3_15 {
	public static void main (String... args){
		Scanner inScan = new Scanner (System.in);
		String another = "y";

		System.out.println ("This application plays Slots with you!");
		System.out.println ("");

		while (another.equals("y")){
			int[] slot = Slots.getNumbers();
			System.out.println (MessageFormat.format("The Slot numbers are: \t{0}\t{1}\t{2}", slot[0], slot[1], slot[2]));

			if (slot[0] == slot[1] && slot[1] == slot[2])
				System.out.println ("Since, all the numbers are the same, you have WON!!!!!");
			else if (slot[0] == slot[1] || slot[0] == slot[2] || slot[1] == slot[2])
				System.out.println ("2 numbers are equal...... You're still a WINNER!!!!!!!");
			else 
				System.out.println ("Well, Tough luck.... Best of luck next time. \n Please visit our other attractions");

			System.out.println ("Do you want to play again? (y/n)");
			another = inScan.nextLine();
		}
	}
}