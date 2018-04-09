//Grading the quizzes
//author: Shardul VAidya(5herl0cked)
//Date: 13/12/17

import console.*;
import java.text.*;

public class Quizzes {
	public static void main (String... args){
		System.out.println ("This program grades quizzes for you.");
		
		String[] quiz = Console.promptString("Please enter the key of the quiz seperated by a space:").split(" ");

		String another = "y";

		while (another.equalsIgnoreCase("y")){
			String[] answers = Console.promptString("Please enter the answers of the quiz to be graded seperated by a space:").split(" ");
			int score = 0;
			for (int i = 0; i < quiz.length; i++)
				if (answers[i].equals(quiz[i]))
					score++;

			System.out.println ("This quiz got a " + score + " out of " + quiz.length);
			System.out.println ("This quiz has got " + (((double)score/quiz.length) * 100) + "%");
			another = Console.promptString("Do you want to grade another quiz?");
		}	
	}
}