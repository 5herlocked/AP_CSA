//uses the square class
//author: Shardul Vaidya (5herl0cked)

import console.*;
import java.util.*;
import java.io.*;

public class SquareTest {
	public static void main (String ... args) throws IOException {
		Scanner scan = new Scanner (new File ("magicData"));

		int count = 1;
		int size = scan.nextInt();

		while (size != -1) {
			Square square = new Square (size);
			square.readSquare(scan);

			System.out.println ("\n***** Square" + count + " *****");

			square.printSquare();

			System.out.println("The sum of the 1st Row is " + square.sumRow(0) + "\nThe sum of the 2nd Row is " +  square.sumRow(1) + "\nThe sum of the 3rd Row is " +  square.sumRow(2));

			System.out.println("The sum of the 1st Column is " + square.sumCol(0) + "\nThe sum of the 2nd Column is " +  square.sumCol(1) + "\nThe sum of the 3rd Column is " +  square.sumCol(2));

			System.out.println("The sum of the main diagonal is " + square.sumMainDiag());

			System.out.println("The sum of the other diagonal is " + square.sumOtherDiag());

			System.out.println (square.magic() ? "This square matrix is a magic square" : "This square matrix isn't a magic square");

			size = scan.nextInt();
			count++;
		}
	}
}