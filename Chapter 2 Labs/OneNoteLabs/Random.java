import java.util.*;

public class Random{
	public static void main(String...args) {
		Scanner inScan = new Scanner (System.in);
		String str = inScan.nextLine();
  		String returnString = str.substring(str.length() - 2, str.length());
  		System.out.println (returnString);
  		//return returnString;
	}	
}
