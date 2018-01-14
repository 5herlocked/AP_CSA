//SortedIntList extends IntList to make sure all additions are always in ascending order
//author: Shardul Vaidya
//Date: 10/01/18

import console.*;
import java.util.*;

public class SortedIntList extends IntList {
	
	//constructor
	public SortedIntList (int size) {
		super(size);
	}

	//adds an integer to the list
	/*
	public void add (int value) {
		if (numElements == 0) {
			list[numElements] = value;
			numElements++;
		}
		else if (numElements == list.length) {
			int[] temp = new int[list.length + 6];
			for (int i = 0; i < list.length; i++)
				temp[i] = list[i];
			list = temp;	
			list[numElements] = value;
			numElements++;
		}
		else {
			int temp;
			for (int i = 1; i < list.length; i++) {
				for(int j = i ; j > 0 ; j--){
					if(list[j] < list[j-1]){
						temp = list[j];
						list[j] = list[j-1];
						list[j-1] = temp;
					}
				}
			}
		}
	}
	*/

	public void sort () {
		int temp;
		for (int i = 1; i < list.length; i++) {
			for(int j = i ; j > 0 ; j--){
				if(list[j] < list[j-1]){
					temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
	}
}