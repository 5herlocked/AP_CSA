/*
*  Grades.java                                          Grades
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/31/17
*
*  Print some grades.
*/

import java.util.*;
import java.text.*;

public class Grades {
    private static List<String> names = new ArrayList<>(Arrays.asList("George", "Nancy", "Pete", "Riece", "Richard"));
    private static List<Integer> grades = new ArrayList<>(Arrays.asList(79, 84, 95, 92, 80));
    private static List<Integer> bonus = new ArrayList<>(Arrays.asList(5, 6, 9, 5, 5));

    private static Scanner inputScanner = new Scanner (System.in);
    private static boolean quit = false;

    private static void addToBook (){
        
        System.out.println ("Please enter students name: ");
        names.add(inputScanner.nextLine());

        System.out.println ("Please enter Student lab grade: ");
        grades.add(Integer.parseInt(inputScanner.nextLine()));

        System.out.println ("Please enter Student bonus points: ");
        bonus.add(Integer.parseInt(inputScanner.nextLine()));

        print();
        interFace();
    }

    private static void print (){

        System.out.println ("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"+ "\n" +
                            "==          Student Points          ==" + " \n" +
                            "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////// \n");
        System.out.println ("Name\t\tGrade\t\tBonus\t\tTotal");
        System.out.println ("____\t\t_____\t\t_____\t\t_____");
        for (int i = 0; i <names.size(); i++){
            int total = grades.get(i) + bonus.get(i);
            System.out.println (MessageFormat.format("{0}\t\t{1}\t\t{2}\t\t{3}",names.get(i), grades.get(i), bonus.get(i),total));
        }
        
    }

    private static void interFace (){
        while (quit == false) {
            System.out.println ("Do you want to add records? (Y/N): ");
            String editString;
            editString = inputScanner.nextLine();

            if (editString.equals("Y"))
                addToBook();
            else {
                System.out.println ("Do you want to Quit (Y/N): ");
                String in = inputScanner.nextLine();

                if (in.equals("Y"))
                    System.exit(1);
            }
        } 
    }

    public static void main (String...args){
        print ();
        interFace();
    }
}