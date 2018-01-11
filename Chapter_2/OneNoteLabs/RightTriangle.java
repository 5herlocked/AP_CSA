import java.util.Scanner;

public class RightTriangle {

    public static void main (String...args) {
        Scanner inScan = new Scanner (System.in);
        double side1, side2;  // lengths of sides of a right triangle
        double hypotenuse;    // length of the hypotenuse

        // Get the lengths of the sides as input
        System.out.print  ("Please enter the lengths of the two sides"   
						+ " of a right triangle:  ");
      
        // Compute the length of the hypotenuse
        side1 = inScan.nextDouble();
        side2 = inScan.nextDouble();      
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        // Print the result
        System.out.println ("Length of hypotenuse: " + hypotenuse);
    }
}
