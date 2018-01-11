//Square class to create and read square matrices and compute
//whether it is magic.
//author: Shardul Vaidya (5herl0cked)
//Date: 31/12/17

import console.*;
import java.util.*;

public class Square {
	private int size;
	private int[][] square;

	//creates a new square of a given size
	public Square (int inSize) {
		size = inSize;
		square = new int[inSize][inSize];
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
		for (int row = 0; row < square.length; row++)
			sum += square[row][col];

		return sum;
	}

	//returns sum of the values in the main diagonal
	public int sumMainDiag () {
		int sum = 0;
		for (int i = 0; i < square.length; i++)
			sum += square[i][i];

		return sum;
	}

	//returns the sum of the values in the other diagonal
	public int sumOtherDiag () {
		int sum = 0;
		for (int i = square.length - 1; i >= 0; i--)
			sum += square[i][square.length - 1 - i];

		return sum;
	}

	//read info into the square form the input stream from a particular scanner
	public void readSquare (Scanner inScan) {
		for (int row = 0; row < square.length; row++)
			for (int col = 0; col < square.length; col++)
				square[row][col] = inScan.nextInt();
	}

	//prints the contenst of the sqaure in a neat manner
	public void printSquare () {
		for (int total = 0; total < square.length; total++) {
			for (int row = 0; row < square[total].length; row++)
				System.out.print (square[total][row] + "    ");
			System.out.println();
		}
	}

	public boolean magic () {
		int[] sum = new int[(size*2) + 2]; //sum of rows, sum of cols, sum of the diags
		for (int i = 0; i < size*2; i++) {
			sum[i] = sumCol(i/2);
			sum[i+1] = sumRow(i/2);
		}
		sum[(size*2)] = sumMainDiag();
		sum[(size*2)+1] = sumOtherDiag();

		//System.out.println(Arrays.toString(sum));

		boolean flag = true;
		int first = sum[0];
		for (int i = 1; i < sum.length; i++)
			if (sum[i] != first) flag = false;

		return flag;
	}
}