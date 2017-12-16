import java.util.*;
import java.text.*;

public class Rand {
    public static void main (String...args){
    	DecimalFormat random = new DecimalFormat("0.0000");
    	double rand = 4/5d;
    	System.out.println(random.format(rand));
	}
}