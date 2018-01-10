//uses the square class
//author: Shardul Vaidya (5herl0cked)

import console.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class SquareTest {
	public static void main (String ... args) throws IOException {
		Scanner scan = new Scanner (new File ("magicData.txt"));

		int count = 1;
		int size = scan.nextInt();

		while (size != -1) {
			Square square = new Square (size);
			square.readSquare(scan);

			System.out.println ("\n***** Square " + count + " *****");

			square.printSquare();
			for (int i = 0; i < size; i++)
				System.out.println(MessageFormat.format("The sum of the {0}st Row is " + square.sumRow(i), i+1));

			for (int i = 0; i < size; i++)
				System.out.println(MessageFormat.format("The sum of the {0}st Column is " + square.sumCol(i), i+1));

			System.out.println("The sum of the main diagonal is " + square.sumMainDiag());

			System.out.println("The sum of the other diagonal is " + square.sumOtherDiag());

			System.out.println (square.magic() ? "This square matrix is a magic square" : "This square matrix isn't a magic square");

			size = scan.nextInt();
			count++;
		}
	}
}