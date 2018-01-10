// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************
import console.*;

public class DogTest {
	public static void main(String... args) {
		Labrador lab = new Labrador(Console.promptString("Please enter the name of the Labrador"), Console.promptString("Please enter the colour of the Labrador"));
		System.out.println(lab.getName() + " says " + lab.speak());

		Yorkshire yorky = new Yorkshire(Console.promptString("Please enter the name of the Yorkshire"));
		System.out.println(yorky.getName() + " says " + yorky.speak());
	}
}
