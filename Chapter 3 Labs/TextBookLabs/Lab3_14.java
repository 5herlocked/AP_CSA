/*
*  Lab3_14.java                                          Lab3_14
*
*  Author: Shardul Vaidya (5herlocked)                  Date:13/10/2017
*
*  Play Rock, Paper, Scisors with a User.
*/
import java.util.*;
import java.text.*;

public class Lab3_14 {

	private static Scanner inScan = new Scanner (System.in);
	private static final String[] options = {"Rock", "Paper", "Scissors"};
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

		int choice = (int) (Math.random() * 3);
		String computerChoice = options[choice];

		System.out.println ("Please Select your play (Rock/Paper/Scissors)");
		String userChoice = inScan.nextLine();

		System.out.println (MessageFormat.format("You have chosen \"{0}\"", userChoice));
		System.out.println (MessageFormat.format("I have chosen \"{0}\"", computerChoice));
		userVictory = check (userChoice, computerChoice);

		if (userVictory)
			System.out.println ("You have won!");
		else if (tie)
			System.out.println ("You have tied with the Computer.");
		else if (incorrectInput)
			System.out.println ("You entered an incorrect choice.");
		else 
			System.out.println ("You have lost.");
	}

	private static void god () {

		//god difficulty: computer chooses based on the input *grinning like a madman*

		System.out.println ("Please Select your play (Rock/Paper/Scissors)");
		String userChoice = inScan.nextLine();

		System.out.println (MessageFormat.format("You have chosen \"{0}\"", userChoice));
		String computerChoice = "Rock";

		if (userChoice.equalsIgnoreCase(options[0]))
			computerChoice = options[1];
		else if (userChoice.equalsIgnoreCase(options[1]))
			computerChoice = options[2];
		else if (userChoice.equalsIgnoreCase(options[2]))
			computerChoice = options[0];

		System.out.println (MessageFormat.format("I have chosen \"{0}\"", computerChoice));
		boolean userVictory = check (userChoice, computerChoice);

		if (userVictory)
			System.out.println ("You have won!");
		else if (tie)
			System.out.println ("You have tied with the Computer.");
		else if (incorrectInput)
			System.out.println ("You entered an incorrect choice.");
		else 
			System.out.println ("You have lost.");

	}

	public static void interFace () {

		//basic interface to reduce clutter in main method

		String another = "y";

		while (another.equals("y")){

			tie = false;
			userVictory = false;

			System.out.println ("Please select a difficulty (Easy/God): ");
			String difficulty = inScan.nextLine();

			switch (difficulty.toLowerCase()){
			case "easy":
				easy();
				break;
			case "god":
				god();
				break;
			}

			System.out.println ("Do you want to play one more game(y/n)?");
			another = inScan.nextLine().toLowerCase();
		}
	} 

	public static void main (String... args){
		System.out.println ("This program plays games of Rock, Paper, Scisors against you!");

		interFace();
	}
}