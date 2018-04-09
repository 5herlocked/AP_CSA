/*
*  Lab3_10.java                                          Lab3_10
*
*  Author: Shardul Vaidya (5herlocked)                  Date:12/9/17
*
*  Plays a game with the user that is sure to drive them crazy.
*/

import java.text.*;
import java.util.*;

public class Lab3_10{
  
    private static Scanner guessScanner = new Scanner (System.in);
    //private static Random guessRandom = new Random();
    private static boolean quit = false;
  
    private static void game () {

        System.out.println ("The Computer has selected a number between 0 and 100, your job is to guess it: ");
        System.out.println ("");
        
      
        int guess = (int) (Math.random() * 101);
        int userGuess = 0;

        //System.out.println (guess);

        do {
            System.out.println ("Please guess one number between 0 and 100: ");
            userGuess = guessScanner.nextInt();

            if (userGuess == guess){
                System.out.println (MessageFormat.format("You have guessed {0} successfully; you may now leave.", guess));
            }
            else if (userGuess == 150){
                System.out.println ("I'm by law required to let you go; you are free.");
                quit = true;
            }
            else if (userGuess > guess) {
                System.out.println ("Please Guess lower.");
            }
            else if (userGuess < guess) {
                System.out.println ("Please Guess Higher.");
            }
        } while (userGuess != guess && userGuess != 150);
    }


    public static void main (String... args){
        System.out.println ("You are about to play the hardest game of your life, if you ever want to exit, type in 150.");

        game ();

        if (quit)
            System.exit(1);
        else {
            System.out.println ("Thank You for Playing!");
        }
    }
}