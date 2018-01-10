import java.util.*;
import console.*;

public class Sort {
	public static void main (String ... args) {
		int[] nums = {16, 51, 68, 13, 3, 81};

		for (int i = 0; i < nums.length; i++){
			int temp;
			//sort ascending or descending (just change the if statement)
			for (int c = 0; c < nums.length; c++) {
				if (nums[i] < nums[c]){
					temp = nums[i];
					nums[i] = nums[c];
					nums[c] = temp;
				}
			}
		}
		System.out.println (Arrays.toString(nums));
	}
}