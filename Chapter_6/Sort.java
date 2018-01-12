import java.util.*;
import console.*;

public class Sort {
	public static void main (String ... args) {
		int[] nums = {16, 51, 68, 13, 3, 81};
		
		///*
		int min, minIndex;//Selection Sort

		for (int i = 0; i < nums.length-1; i++)
		{
			min = nums[i];
			minIndex = i;
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[j] < min)
				{
					min = nums[j];
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			System.out.println (Arrays.toString(nums));
		}
		//*/
		/*
		for (int i = 0; i < nums.length; i++){ //my sort
			int temp;
			//sort ascending or descending (just change the if statement)
			for (int c = 0; c < nums.length; c++) {
				if (nums[i] < nums[c]){
					temp = nums[i];
					nums[i] = nums[c];
					nums[c] = temp;
				}
			}
			System.out.println (Arrays.toString(nums));
		}
		*/
	}
}