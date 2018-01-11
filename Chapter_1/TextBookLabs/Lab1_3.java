/*
* Lab1_3.java                                           Lab1_3
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/17/17
*
* This lab is to extract information from me unvoluntarily ( They are spying on me ) 
*/


public class Lab1_3 {
  public static void main (String [] args) {
    String name = "Shardul Vaidya";
    String birthday = "06/10/2017" ;
    String [] hobbies = new String[] {"Reading", "Writing", "Coding"};
    String [] books = new String [] {"The Book Thief", "Frankenstein"};
    String [] movies = new String [] {"The Perks of being a Wallflower", "The Matrix", "Argo"};
    
    System.out.println ("My name is " + name );
    System.out.println ("My birthday is " + birthday);
    System.out.println ("My hobbies are " + hobbies[0] + " and " + hobbies[1] + " and " + hobbies[2] + ".");
    System.out.println ("My favorite books are " + books[0] + " and " + books [1] + ".");
    System.out.println ("My favorite Movies are " + movies[0] + " and " + movies[1] + " and " + movies [2] + ".");
  }
}