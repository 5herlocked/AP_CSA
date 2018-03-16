import console.*;
import java.util.*;
public class Rand {
	/*public static int f1 (int a, int b) {
		if (a == b)
			return b;
		else
			return a +f2(a-1, b);
	}

	public static int f2 (int p, int q) {
		if (p < q)
			return p + q;
		else
			return p + f1(p-2, q);
	}*/

	public static String filter (String str, String pattern){
		int pos = str.indexOf(pattern);
		if (pos == -1)
			return str;
		else
			return filter(str.substring(0,pos)+str.substring(pos+pattern.length()), pattern);
	}

	public static void main(String[] args) {
		//System.out.println(f1(5,3));
		System.out.println(filter("papaya", "pa"));
	}
}