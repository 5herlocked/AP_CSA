//SortedIntList extends IntList to make sure all additions are always in ascending order
//author: Shardul Vaidya
//Date: 10/01/18

import java.util.*;

public class SortedIntList extends IntList {
	
	//constructor
	public SortedIntList (int size) {
		super(size);
	}
	
	public void sort () {
		int min, minIndex;
		for (int i = 0; i < list.length-1; i++)
		{
			min = list[i];
			minIndex = i;
			for (int j = i + 1; j < list.length; j++)
			{
				if (list[j] > min)
				{
					min = list[j];
					minIndex = j;
				}
			}
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
			System.out.println (Arrays.toString(list));
		}
	}
}