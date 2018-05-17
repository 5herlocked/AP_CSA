 //@author: 5herl0cked
//Pristine Class file for Rock Paper Scissors.
//Date: November 11, 2017

import java.util.*;
import java.text.*;

public class RPS {
	private static Scanner inScan = new Scanner (System.in);
	private static final String[] options = {"Rock", "Paper", "Scissors"};
	private static int victoryCount = 0;
	private static int lossCount = 0;
	private static int tieCount = 0;
	private static int incorrect = 0;
	private static int totalCount = 0;
	private static boolean tie = false;
	private static boolean userVictory = false;
	private static boolean incorrectInput = false;

	private static boolean check (String userChoice, String computerChoice) {

		//Checks for victory or loss of the user while returning ties or incorrect inputs

		if (userChoice.equalsIgnoreCase(options[0]) && computerChoice.equalsIgnoreCase(options[2]))
			return true;
		else if (userChoice.equalsIgnoreCase(options[1]) && computerChoice.equalsIgnoreCase(options[0]))
			return true;
		else if (userChoice.equalsIgnoreCase(options[2]) && computerChoice.equalsIgnoreCase(options[1]))
			return true;
		else if (userChoice.equalsIgnoreCase(options[0]) && computerChoice.equalsIgnoreCase(options[1]))
			return false;
		else if (userChoice.equalsIgnoreCase(options[1]) && computerChoice.equalsIgnoreCase(options[2]))
			return false;
		else if (userChoice.equalsIgnoreCase(options[2]) && computerChoice.equalsIgnoreCase(options[0]))
			return false;
		else if (userChoice.equalsIgnoreCase(computerChoice)){
			tie = true;
			return false;
		}
		else {
			System.out.println ("Your choice is incorrect.");
			incorrectInput = true;
			return false;
		}
	}


	private static void easy () {

		//easy difficulty: computer chooses before asking *for babies who can't take defeat*

		int choice = (int) (Math.random() * 3);  //random computer choice
		String computerChoice = options[choice]; //assign value based on the random choice
		String userChoice;

		do {
			System.out.println ("Please Select your play (Rock/Paper/Scissors)");
			userChoice = inScan.nextLine().trim();  //take input from Users
		} while (!(userChoice.equalsIgnoreCase(options[1]) || userChoice.equalsIgnoreCase(options[0]) || userChoice.equalsIgnoreCase(options[2])));

		System.out.println (MessageFormat.format("You have chosen \"{0}\"", userChoice));
		System.out.println (MessageFormat.format("I have chosen \"{0}\"", computerChoice));
		
		//determines victory
		userVictory = check (userChoice, computerChoice); 

		//prints required statement (victory, loss or tie)
		if (userVictory) {
			System.out.println ("You have won!");
			victoryCount++;
		}
		else if (tie){
			System.out.println ("You have tied with the Computer.");
			tieCount++;
		}
		else if (incorrectInput) {
			System.out.println ("You entered an incorrect choice.");
			incorrect++;
		}
		else {
			System.out.println ("You have lost.");
			lossCount++;
		}
		totalCount++;
	}

	private static void god () {

		//god difficulty: computer chooses based on the input *grinning like a madman*
		String userChoice;
		do {
			System.out.println ("Please Select your play (Rock/Paper/Scissors)");
			userChoice = inScan.nextLine().trim();  //take input from Users
		} while (!(userChoice.equalsIgnoreCase(options[1]) || userChoice.equalsIgnoreCase(options[0]) || userChoice.equalsIgnoreCase(options[2])));

		System.out.println (MessageFormat.format("You have chosen \"{0}\"", userChoice));
		String computerChoice = "Rock";

		//conditional statements to determine the required choice to win.

		if (userChoice.equalsIgnoreCase(options[0]))
			computerChoice = options[1];
		else if (userChoice.equalsIgnoreCase(options[1]))
			computerChoice = options[2];
		else if (userChoice.equalsIgnoreCase(options[2]))
			computerChoice = options[0];

		System.out.println (MessageFormat.format("I have chosen \"{0}\"", computerChoice));
		boolean userVictory = check (userChoice, computerChoice);

		//prints required statement (victory, loss or tie)
		if (userVictory) {
			System.out.println ("You have won!");
			victoryCount++;
		}
		else if (tie){
			System.out.println ("You have tied with the Computer.");
			tieCount++;
		}
		else if (incorrectInput) {
			System.out.println ("You entered an incorrect choice.");
			incorrect++;
		}
		else {
			System.out.println ("You have lost.");
			lossCount++;
		}
		totalCount++;
	}

	public static void interFace () {

		//basic interface
		String another = "y";
		while (another.equalsIgnoreCase("y")){
			tie = false;
			userVictory = false;

			System.out.println ("Please select a difficulty (Easy/God): ");
			String difficulty = inScan.nextLine().trim();
			
			switch (difficulty.toLowerCase()){
				case "easy":
				easy();
				break;
				case "god":
				god();
				break;
				default:
				easy();
				break;
			}
			
			System.out.println ("Do you want to play one more game(y/n)?");
			another = inScan.nextLine().trim();
		}

		System.out.println ("You played: " + totalCount + " times");
		System.out.println ("You have won: " + victoryCount + " times");
		System.out.println ("You have lost: " + lossCount + " times");
		System.out.println ("You have tied: " + tieCount + " times");
		System.out.println ("You entered an incorrect Input: " + incorrect + " times");
	} 
}