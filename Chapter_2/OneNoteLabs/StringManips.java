import java.util.Scanner;

public class StringManips {
    
    public static void main (String...args) {
    	Scanner inScan = new Scanner (System.in);

		String phrase = new String ("This is a String test.");
		int phraseLength;   // number of chars in the phrase String
		int middleIndex;    // index of the middle char in the String
		String middleThree;
		String firstHalf;   // first half of the phrase String
		String secondHalf;  // second half of the phrase String
		String switchedPhrase; //a new phrase w/ orig halves switched
		String city, state;

		//ask the user for state and city
		System.out.println ("Please enter your state: ");
		state = inScan.nextLine();
		System.out.println ("Please enter your city: ");
		city = inScan.nextLine();

		// compute the length and middle index of the phrase
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;
		middleThree = phrase.substring(middleIndex - 1, middleIndex + 2);

		// get the substring for each half of the phrase
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);

		// concatenate the firstHalf at the end of the secondHalf
		switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = switchedPhrase.replace (" ", "*");

		//concatenaet the states and the city
		String statePrint = state.toUpperCase() + city.toLowerCase() + 
							state.toUpperCase();

		// print information about the phrase
		System.out.println();
		System.out.println ("Original phrase: " + phrase);
		System.out.println ("Length of the phrase: " + phraseLength +
		   					" characters");
		System.out.println ("Index of the middle: " + middleIndex);
		System.out.println ("Character at the middle index: " + 
		   					phrase.charAt(middleIndex));
		System.out.println ("Switched phrase: " + switchedPhrase);
		System.out.println ("Middle three Letters are: " + middleThree);
		System.out.println ("You live in: " + statePrint);
		System.out.println();
    }
}
