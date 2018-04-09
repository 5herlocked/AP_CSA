//runner class for GameTTT
//author: Shardul Vaidya (5herl0cked) & Milan Tahliani
//Date: 5/12/17

import console.*;
import java.text.*;

public class RunnerGame {
	public static void main (String... args) {
		System.out.println ("You are about to play a game of Tic Tac Toe");
		GameTTT game = new GameTTT(Console.promptString("Please enter Player 1's name.") ,Console.promptString("Please enter Player 2's name."));
		String another;
		String changeName;

		do {
			game.printBoard();
			int count = 0;
			
			while (!game.getCompletion()){
				game.nextMove(Console.promptInt("Please enter the Location of " + ((count % 2 == 0) ? game.getName(1) : game.getName(2)) + "\'s move."), (count % 2 == 0) ? true : false);
				game.printBoard();
				game.check();
				count++;
			}
			
			System.out.println(game.getVictor());
			
			changeName = Console.promptString("Do you want to change the names of the players? (y/n)");
			if (changeName.equalsIgnoreCase("y"))
				game.changeName(Console.promptString("Who is the new Player 1?"), Console.promptString("Who is the new Player 2?"));
			
			another = Console.promptString("Do you want to play another game? (y/n)");

			game.resetBoard();
		} while (another.equalsIgnoreCase("y"));
	}
}