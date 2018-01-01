//Square class to create and read square matrices and compute
//whether it is magic.
//author: Shardul Vaidya (5herl0cked)
//Date: 31/12/17

import console.*;
import java.util.*;

public class Square {
	private int[][] square;

	//creates a new square of a given size
	public Square (int size) {
		square = new int[size][size];
	}

	//returns the sum of the values in a row
	public int sumRow (int row) {
		int sum = 0;
		for (int c : square[row])
			sum += c;

		return sum;
	}

	//returns the sum of the values in a column
	public int sumCol (int col) {
		int sum = 0;
		for (int row = 0; row < 3; row++)
			sum += square[row][col];

		return sum;
	}

	//returns sum of the values in the main diagonal
	public int sumMainDiag () {
		int sum = 0;
		for (int row = 0; row <= 2; row++)
			sum += square[row][row];

		return sum;
	}

	//returns the sum of the values in the other diagonal
	public int sumOtherDiag () {
		int sum = 0;
		for (int row = 2; row >= 0; row--)
			sum += square[row][row];

		return sum;
	}

	//read info into the square form the input stream from a particular scanner
	public void readSquare (Scanner inScan) {
		for (int row = 0; row < square.length; row++)
			for (int col = 0; col < square.length; col++)
				square[row][col] = inScan.nextInt();
	}

	//prints the contenst of the sqaure in a neat way
	public void printSquare () {
		for (int total = 0; total < square.length; total++) {
			for (int row = 0; row < square[total].length; row++)
				System.out.print (square[total][row] + "    ");
			System.out.println();
		}
	}

	public boolean magic () {
		if ((sumCol(0) == sumCol(1) && sumCol(1) == sumCol(2)) == (sumRow(0) == sumRow(1) && sumRow(1) == sumRow(2)) && sumRow(0) == sumMainDiag() && sumMainDiag() == sumOtherDiag())
			return true;

		return false;
	}
}