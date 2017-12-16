//Reversing the Array
//author: Shardul VAidya(5herl0cked)
//Date: 13/12/17

import console.*;
import java.text.*;
import java.util.*;

public class Array {
	public static void main (String... args){
		System.out.println ("This program reverses an array.");
		
		String[] array = Console.promptString("Please enter the list of numbers that you want to reverse:").split(" ");
		
		/*
		Collections.reverse(Arrays.asList(array));

		StringBuilder print = new StringBuilder();
		for (String add : array)
			print.append(add + " ");
		*/

		for (int i = 0; i < array.length/2; i++){
			String temp = "";
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}

		
		StringBuilder print = new StringBuilder();
		for (String add : array)
			print.append(add + " ");

		System.out.println ("The reversed array is: " + print);
	}
}