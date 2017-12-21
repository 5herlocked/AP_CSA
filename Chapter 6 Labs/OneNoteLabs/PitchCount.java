//Jagged Array thing
//author: Shardul Vaidya (5herl0cked)
//Date: 14/12/17

import console.*;
import java.text.*;

public class PitchCount {
	/*
	private static int getLargest (int pitcherNumber) {
		int temp = Integer.MIN_VALUE;
		for (int i : pitchArray[pitcherNumber - 1]) {
			temp = (i > temp) ? i : temp;
		}
		return temp;
	}
	private static int getSmallest (int pitcherNumber) {
		int temp = Integer.MAX_VALUE;
		for (int i : pitchArray[pitcherNumber - 1]) {
			temp = (i < temp) ? i : temp;
		}
		return temp;
	}
	private static int getSum (int pitcherNumber) {
		int sum = 0;
		for (int i : pitchArray[pitcherNumber - 1]) {
			sum += i;
		}
		return sum;
	}
	private static double getAverage (int pitcherNumber) {
		return (double)getSum(pitcherNumber)/pitchArray[pitcherNumber - 1].length;
	}
	*/

	public static void main (String... args){
		int[][] pitchArray = {
			{45, 105, 67},//pitchArray[0].length
			{81, 100, 93, 25, 128, 88},
			{45, 53},
			{79, 107, 53, 79},
			{11, 9, 3, 63, 20, 18, 3},
		};
		
		String another;
		do{
			int pitcherInfoNum = Console.promptInt("What pitchers info do you want?");
			int averageCount, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, total, sum = 0;

			for (int j : pitchArray[pitcherInfoNum - 1])
				largest = (j > largest) ? j : largest;

			for (int k : pitchArray[pitcherInfoNum - 1])
				smallest = (k < smallest) ? k : smallest;
			
			for (int l : pitchArray[pitcherInfoNum - 1])
				sum += l;

			System.out.println (MessageFormat.format("Pitcher #{0} pitched {1} games." + 
				" His largest pitch count was; {2}, smallest was: {3}, total was: {4}," + 
				" and the average pitch count was: {5}", pitcherInfoNum, pitchArray[pitcherInfoNum-1].length, largest,
				smallest, sum, (double)sum/pitchArray[pitcherInfoNum-1].length));
			another = Console.promptString("Do you want the information of another pitcher?(y/n)");
		}while (another.equalsIgnoreCase("y"));
	}
}