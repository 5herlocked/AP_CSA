public class HorseBarn {
	public int countPixelValues (int row, int col){
		if (col == pixelValues[row].length-1)
			return (pixelValues[row][col] == WHITE) ? 1 + countPixelValues(row + 1, 0) : countPixelValues(row + 1, 0);
		if (row == pixelValues.length - 1 && col == pixelValues[row].length - 1)
			return (pixelValues[row][col] == WHITE) ? 1 : 0;

		return (pixelValues[row][col] == WHITE) ? 1 + countPixelValues(row + 1, col + 1) : countPixelValues(row + 1, col + 1);
	}
}