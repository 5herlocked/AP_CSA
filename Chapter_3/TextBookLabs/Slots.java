//Slots Pristine Class ready for extension

import java.util.*;

public class Slots {

	public static int num1, num2, num3;

	public static int[] getNumbers() {
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		num3 = (int) (Math.random() * 10);

		int[] slotNums = new int[3];

		slotNums[0] = num1;
		slotNums[1] = num2;
		slotNums[2] = num3;

		return slotNums;
	}
}