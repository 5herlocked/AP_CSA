/*
Pristine Class File for the diamond Patterns thing.
*/

public class Patterns {
	public static void a (){
		String master = "**********         ";
		for (int i = 0; i < 10; i++)
			System.out.println (master.substring(i, master.length()/2 + i + 1));
	}

	public static void b (){
		String master = "         **********";
		for (int i = 0; i < 10; i++)
			System.out.println (master.substring(i, master.length()/2 + i + 1));
	}

	public static void c (){
		String master = "          **********";
		for (int i = 10; i >= 0; i--)
			System.out.println (master.substring(i, master.length()/2 + i));
	}

	public static void d (){
		for (int row = 1; row <= 5; row ++){ //upper half of the diamond
			for (int spaces = 5; spaces > row; spaces--)
				System.out.print (" ");

			for (int star = 1; star <= row; star++)
				System.out.print ("*");

			for (int star = 2; star <= row; star++)
				System.out.print ("*");

			for (int spaces = 5; spaces >row; spaces--)
				System.out.print (" ");

			System.out.println () ;
		}

		for (int row = 5; row > 1; row --){ //lower half of the diamond
			for (int spaces = 6; spaces > row; spaces--)
				System.out.print (" ");

			for (int star = 2; star <= row; star++)
				System.out.print ("*");

			for (int star = 3; star <= row; star++)
				System.out.print ("*");

			for (int spaces = 6; spaces > row; spaces--)
				System.out.print (" ");
			
			System.out.println () ;
		/*
		final String master1 = "    *********";
		final String master2 = "     **********";
		for (int i = 0; i < 5; i++) 
			System.out.println(master1.substring(i, 5 + 2 * i));

		for (int i = 5; i > 0; i--)
			System.out.println(master2.substring(i - 1, master2.length()/3 + (2 * i) - 3));
		*/
		}
	}
}