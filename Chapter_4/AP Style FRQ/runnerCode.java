//runner methods for code class.
//author: Shardul Vaidya (5herl0cked) & Milan Tahliani
//Date 02/12/17

import console.*;

public class runnerCode {
	public static void main (String... args) {

		//Text Book Example - Checks out!
		/*
		Code code = new Code ("ABCdef123ghi456jklMNO");
		code.hide (2, 7);
		code.recover (5, 9);
		code.hide (3, 14);
		code.hide (6, 10);
		code.recover (5, 6);
		code.recover (0, 14);
		*/
		
		//Interactive UX for the same program.
		Code code = new Code (Console.promptString("Please enter the String that you would like to modify."));
		String another;
		do {
			switch (Console.promptString("Do you want to \"hide\" or \"recover\"? (default is hide)")){
				case "hide":
					code.hide(Console.promptInt("Enter the start point of the hide operation (must be less than the length of the string): "),
						Console.promptInt("Enter the end point of the hide operation (must be less than the length of the String and greater than the start point): "));
					break;
				case "recover":
					code.recover(Console.promptInt("Enter the start point of the recover operation (must be less than the length of the string): "),
						Console.promptInt("Enter the end point of the recover operation (must be less than the length of the String and greater than the start point): "));
					break;
				default:
					code.hide(Console.promptInt("Enter the start point of the hide operation (must be less than the length of the string): "),
						Console.promptInt("Enter the end point of the hide operation (must be less than the length of the String and greater than the start point): "));
					break;

			}
			another = Console.promptString("Do you want to continue operations on the string?(y/n)");
		}while (another.equalsIgnoreCase("y"));

		System.out.println (code.getFinal());
		
		//Just to randomise the process... Works as well.
		/*
		for (int i = 0; i < 5; i++) {
			code.hide((int)(Math.random() * code.getCode().length()), (int)(Math.random() * code.getCode().length()));
			code.recover((int)(Math.random() * code.getCode().length()), (int)(Math.random() * code.getCode().length()));
		}
		*/
	}
}