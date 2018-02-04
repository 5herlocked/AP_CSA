//Jagged Array thing
//author: Shardul Vaidya (5herl0cked)
//Date: 14/12/17

import console.*;
import java.text.*;

public class PitchCount {
	public static void main (String... args){
		int[][] pitchArray = {
			{45, 105, 67}, //pitchArray[0].length is the length
			{81, 100, 93, 25, 128, 88},
			{45, 53},
			{79, 107, 53, 79},
			{11, 9, 3, 63, 20, 18, 3},
		};
		
		String another;

		//do-while for user based repetition.
		do{
			int pitcherInfoNum;
			do {
				pitcherInfoNum = Console.promptInt("What pitchers info do you want");
			} while (pitcherInfoNum > 5);
			
			int largest = pitchArray[pitcherInfoNum-1], smallest = pitchArray[pitcherInfoNum-1], sum = 0;

			//foreach loop to find largest pitch
			for (int j : pitchArray[pitcherInfoNum - 1])
				largest = (j > largest) ? j : largest;

			//foreach loop for the smallest value
			for (int k : pitchArray[pitcherInfoNum - 1])
				smallest = (k < smallest) ? k : smallest;
			
			//foreach for the sum of the values
			for (int l : pitchArray[pitcherInfoNum - 1])
				sum += l;

			//prints using placeholders
			System.out.println (MessageFormat.format("Pitcher# {0} pitched {1} games." + 
				" His largest pitch count was; {2}, smallest was: {3}, total was: {4}," + 
				" and the average pitch count was: {5}", pitcherInfoNum, pitchArray[pitcherInfoNum-1].length, largest,
				smallest, sum, (double)sum/pitchArray[pitcherInfoNum-1].length));
			
			//terminal val
			another = Console.promptString("Do you want the information of another pitcher?(y/n)");
		}while (another.equalsIgnoreCase("y"));
	}
}