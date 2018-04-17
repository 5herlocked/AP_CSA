import java.util.*;

public class HiiddennWord{
	public static void main (String ... args) {
		HiddenWord n = new HiddenWord("SMILE");

		Scanner inScan = new Scanner(System.in);
		System.out.println("guess:");
		System.out.println(n.gethint(inScan.nextLine()));
	}
}