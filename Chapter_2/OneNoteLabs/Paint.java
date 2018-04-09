/*
*  Paint.java                                           Paint
*
*  Author: Shardul Vaidya (5herlocked)                  Date:09/05/17
*
* Determine how much paint is needed to paint the walls of a given room.
*/

import java.text.MessageFormat;
import java.util.*;

public class Paint {

    private static final int COVERAGE_PER_GAL = 350;

    private static double calculate (double l, double w, double h){
        double area = 2*w*h + 2*l*h;
        
        return area;
    }

    private static void interFace (){

        double length, width, height, totalArea, paintNeeded;

        Scanner scan = new Scanner (System.in);
    
        System.out.println ("Input Length of the Room (feet): ");
        length = scan.nextDouble();

        System.out.println("Input the width of the room (feet): ");
        width = scan.nextDouble();

        System.out.println ("Input the height of the room (feet): ");
        height = scan.nextDouble();

        System.out.println ("Input the number of doors in the room: ");
        int numberOfDoors = scan.nextInt();
        //System.out.println ("Input the size of the door (sq. ft.): ");
        //double sizeDoor = scan.nextDouble();

        System.out.println ("Input the number of windows in the room: ");
        int numberOfWindows = scan.nextInt();
        //System.out.println ("Input the size of the windows (Sq. ft.): ");
        //double sizeWindow = scan.nextDouble();

        totalArea = calculate(length, width, height) - 
        (numberOfDoors * 20 + numberOfWindows * 15);

        paintNeeded = totalArea/COVERAGE_PER_GAL;

        System.out.println (MessageFormat.format("The lenght of the room is: {0} feet \n" +
        "The width of the room is: {1} feet \n" +
        "The heigh of the room is: {2} feet \n" +
        "The Area of the room is: {3} sq. feet \n" +
        "The amount of paint required is: {4} gal"
        , length, width, height, totalArea, paintNeeded));
    }

    public static void main (String...args){

        System.out.println ("An APP to determine how much paint will be" + 
                            "required to paint a ceratin room.");

        interFace();
    }
}