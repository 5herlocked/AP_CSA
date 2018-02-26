import console.*;
import java.util.*;
public class Rand {
	public static void doSomething(int num1, String name1)
 {
   num1 = 5;
   name1 = name1.toUpperCase();
  }

public static void main(String[] args)
  {
    int num = 1;
    String name = "Tom";
    doSomething(num, name);
    System.out.print(num + " " + name);
 }
}