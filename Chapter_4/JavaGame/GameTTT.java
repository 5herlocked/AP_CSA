//pristine class file for no particular reason
//author: Shardul Vaidya (5herl0cked) & Milan Tahliani
//Date: 05/12/2017

import java.util.*;
import java.text.*;
import console.*;

public class GameTTT {
	private static String player1;
	private static String player2;
	private static int counter = 0;
	private static boolean[] victoryCondition = {false, false, false}; //victoryConditions in the format(player1, player2, tie)
	private static char[] row1 = {'1', '2', '3'};
	private static char[] row2 = {'4', '5', '6'};
	private static char[] row3 = {'7', '8', '9'};

	//constructor
	public GameTTT (String player1Name, String player2Name) {
		player1 = player1Name;
		player2 = player2Name;
	}

	//checks the conditions necessary for victory or tie.
	public static void check () {
		if (row1[0] == row1[1] && row1[1] == row1[2] && row1[2] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false;
		}
		else if (row1[0] == row1[1] && row1[1] == row1[2] && row1[2] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false; 
		}
		else if (row2[0] == row2[1] && row2[1] == row2[2] && row2[2] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false;
		}
		else if (row2[0] == row2[1] && row2[1] == row2[2] && row2[2] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false;
		}
		else if (row3[0] == row3[1] && row3[1] == row3[2] && row3[2] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false;
		}
		else if (row3[0] == row3[1] && row3[1] == row3[2] && row3[2] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false; 
		}
		else if (row1[0] == row2[0] && row2[0] == row3[0] && row3[0] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false; 
		}
		else if (row1[0] == row2[0] && row2[0] == row3[0] && row3[0] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false; 
		} 		 
		else if (row1[1] == row2[1] && row2[1] == row3[1] && row3[1] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false; 
		}
		else if (row1[1] == row2[1] && row2[1] == row3[1] && row3[1] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false; 
		}
		else if (row1[2] == row2[2] && row2[2] == row3[2] && row3[2] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false;
		}
		else if (row1[2] == row2[2] && row2[2] == row3[2] && row3[2] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false ;
		}
		else if (row1[0] == row2[1] && row2[1] == row3[2] && row3[2] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false ;
		}
		else if (row1[0] == row2[1] && row2[1] == row3[2] && row3[2] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false ;
		}
		else if (row1[2] == row2[1] && row2[1] == row3[0] && row3[0] == 'X'){
			victoryCondition[0] = true;
			victoryCondition[1] = false;
			victoryCondition[2] = false ;
		}
		else if (row1[2] == row2[1] && row2[1] == row3[0] && row3[0] == 'O'){
			victoryCondition[0] = false;
			victoryCondition[1] = true;
			victoryCondition[2] = false ;
		}
		else if (counter > 8) {
			victoryCondition[0] = false;
			victoryCondition[1] = false;
			victoryCondition[2] = true;
		}
	}

	//prints the actual board of the game
	public static void printBoard () {
		System.out.println (MessageFormat.format("  {0}  |  {1}  |  {2}  " + "\n" +
												 "-----------------" + "\n" +
												 "  {3}  |  {4}  |  {5}  " + "\n" +
												 "-----------------" + "\n" +
												 "  {6}  |  {7}  |  {8}  ", row1[0], row1[1], row1[2], 
												 row2[0], row2[1], row2[2], row3[0],
												 row3[1], row3[2]));
	}

  	//accessor methods
  	//checks if victory or loss has been achieved
	public static boolean getCompletion() {
		if (victoryCondition[0] || victoryCondition[1] || victoryCondition[2]){
			return true;
		}
		
		return false;
	}

	//returns the String for victory print
	public static String getVictor () {
		if (victoryCondition[0])
			return player1 + " Won!";
		else if (victoryCondition[1])
			return player2 + " Won!";
		else if (victoryCondition[2])
			return "\'Tis a Tie!";
		
		return "Something seems to have gone wrong!";
	}

	//Returns the names of the players
	public static String getName (int playerNumber) {
		return playerNumber == 1 ? player1 : player2;
	}

	//mutator methods
	
	//Change player name
	public static void changeName(String player1Name, String player2Name) {
		player1 = player1Name;
		player2 = player2Name;
	}

	//the method to play the game (Location is 1 - 9, the symbol is determined by the runner program)
	public static void nextMove(int location, boolean player1) {
		if (location == 1)
			row1[0] = (player1 ? 'X' : 'O');
		else if (location == 2)
			row1[1] = (player1 ? 'X' : 'O');
		else if (location == 3)
			row1[2] = (player1 ? 'X' : 'O');
		else if (location == 4)
			row2[0] = (player1 ? 'X' : 'O');
		else if (location == 5)
			row2[1] = (player1 ? 'X' : 'O');
		else if (location == 6)
			row2[2] = (player1 ? 'X' : 'O');
		else if (location == 7)
			row3[0] = (player1 ? 'X' : 'O');
		else if (location == 8)
			row3[1] = (player1 ? 'X' : 'O');
		else if (location == 9)
			row3[2] = (player1 ? 'X' : 'O');
		else
			System.out.println ("You entered invalid parameters. Thus, you must forfeit your move!");
		counter++;
	}

	//resets the board and the conditions
	public static void resetBoard () {
		victoryCondition[0] = false;
		victoryCondition[1] = false;
		victoryCondition[2] = false;
		row1[0] = '1';
		row1[1] = '2';
		row1[2] = '3';
		row2[0] = '4';
		row2[1] = '5';
		row2[2] = '6';
		row3[0] = '7';
		row3[1] = '8';
		row3[2] = '9';
		counter = 0;
	}
}