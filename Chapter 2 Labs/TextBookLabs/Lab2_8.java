/*
*  Lab2_8.java                                          Lab2_8
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/23/17
*
*  Calculates the distance between 2 points on the coordinate plane
*/

import java.util.*;
import java.lang.*;

public class Lab2_8 {

    private static double measure (Double xCoordinate1, Double yCoordinate1, Double xCoordinate2, Double yCoordinate2){

        double distance = Math.sqrt(Math.abs(Math.pow((xCoordinate2 - xCoordinate1), 2) + Math.pow((yCoordinate2 - yCoordinate1), 2)));
        return distance;
    }

    private static double parseCoordinates (String[]seperateCoordinates1, String[]seperateCoordinates2) {

        double x1 = Double.parseDouble (seperateCoordinates1[0].trim());
        double y1 = Double.parseDouble (seperateCoordinates1[1].trim());


        double x2 = Integer.parseInt (seperateCoordinates2[0].trim());
        double y2 = Integer.parseInt (seperateCoordinates2[1].trim());

        double distance = measure(x1, y1, x2, y2);

        return distance;
    }

    private static void input () {

        Scanner coordinateScanner = new Scanner (System.in);

        System.out.println ("Give the 1st coordinate (x , y): ");
        String coordinate1 = coordinateScanner.nextLine();
        String [] seperateCoordinates1 = coordinate1.split(",");

        System.out.println ("Give the 2nd coordinate (x , y): ");
        String coordinate2 = coordinateScanner.nextLine();
        String [] seperateCoordinates2 = coordinate2.split(",");

        System.out.println ("The Distance between " + coordinate1 + " and " + coordinate2 + " is " + parseCoordinates(seperateCoordinates1, seperateCoordinates2));

        coordinateScanner.close();
    }

    public static void main (String...args){

        System.out.println ("MEASURE THE DISTANCE BETWEEN 2 POINTS ON A COORDINATE PLANE");

        input();
    }
}