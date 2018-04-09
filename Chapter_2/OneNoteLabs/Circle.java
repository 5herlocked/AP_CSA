/*
*  Circle.java                                          Circle
*
*  Author: Shardul Vaidya (5herlocked)                  Date:09/07/17
*
* Determine the Area and Circunference of a Circle with an input radius.
*/
import java.text.*;
public class Circle
{
    public static void main(String...args)
    {
     
        int radius = 10;
        double area = Math.PI * radius * radius;
        double circum = Math.PI * 2 * radius;

        System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
        System.out.println (MessageFormat.format("The circumference of a circle with radius {0} is {1}."
                            ,radius , circum));

        radius = 20;
        area = Math.PI * radius * radius;
        circum = Math.PI * 2 * radius;
        System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
        System.out.println (MessageFormat.format("The circumference of a circle with radius {0} is {1}."
                        ,radius , circum));
    }
}
