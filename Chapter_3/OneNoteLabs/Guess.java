/*
*  Guess.java                                          Guess
*
*  Author: Shardul Vaidya (5herlocked)                  Date:12/9/17
*
*  Plays a game with the user that is sure to drive them crazy.
*/

import java.text.*;
import java.util.*;

public class Guess{
  
    private static Scanner guessScanner = new Scanner (System.in);
    private static boolean quit = false;
  
    private static void game () {

        System.out.println ("The Computer has selected a number between 0 and 100, your job is to guess it: ");
        System.out.println ("");
        
      
        int guess = (int) (Math.random() * 101);
        int userGuess = 0;
        int numberOfGuesses = 0;
        int higherGuesse = 0;
        int lowerGuesses = 0;

        System.out.println (guess);

        do {
            System.out.println ("Please guess one number between 0 and 100: ");
            userGuess = guessScanner.nextInt();
            numberOfGuesses++;
            if (userGuess == guess){
                System.out.println (MessageFormat.format("You have guessed {0} successfully; you may now leave.", guess));
                System.out.println ("You took " + numberOfGuesses + " to guess the right number!");
            }
            else if (userGuess == 150){
                System.out.println ("I'm by law required to let you go; you are free.");
                quit = true;
            }
            else if (userGuess > guess){

                System.out.println ("Please Guess lower.");
                higherGuesse++;
            }

            else if (userGuess < guess) {

                System.out.println ("Please Guess Higher.");
                lowerGuesses++;
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