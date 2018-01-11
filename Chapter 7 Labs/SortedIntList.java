//SortedIntList extends IntList to make sure all additions are always in ascending order
//author: Shardul Vaidya
//Date: 10/01/18

import console.*;
import java.util.*;

public class SortedIntList extends IntList {
	protected int numElements = 0;

	//constructor
	public SortedIntList (int size) {
		super(size);
	}

	//adds an integer to the list

	public void add (int value) {
		if (numElements == 0) {
			list[numElements] = value;
			numElements++;
		}
		else if (numElements == list.length) {
			int[] temp = new int[list.length + 6];
			temp = list;
			list = temp;
			list[numElements] = value;
			numElements++;
		}
		else {
			list[numElements] = value;
			numElements++;
			int temp = 0;
			for (int i = 0; i < list.length; i++){
				for (int c = 0; c < list.length; c++) {
					if (list[i] < list[c]) {
						temp = list[i];
						list[i] = list[c];
						list[c] = temp;
					}
				}
			}
		}
	}
}