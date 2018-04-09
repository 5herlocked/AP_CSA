//pristine class file for the differentiated learning thing
//Author: Shardul Vaidya (5herl0cked) & Milan Tahliani
//Date: 1/12/17 
public class Code {
	private String myCode;
	private String intermediateCode;
	private StringBuilder modifiedString = new StringBuilder();

  	//Constructor
	public Code (String code) {
		myCode = code;
		modifiedString.append(code);
	}

	//returns the original value of myCode as defined by user.
	public String getCode() {
		return myCode;
	}

	public String getFinal() {
		return intermediateCode;
	}

  	//hide method uses StringBuilder to replace the required things.
	public void hide(int p1, int p2) {
		if (p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
			StringBuilder requiredx = new StringBuilder();

			for (int i = 0; i < (p2 - p1); i++)
				requiredx.append("X");

			modifiedString.replace(p1, p2, requiredx.toString());
			intermediateCode = modifiedString.toString();
			System.out.println (intermediateCode);
		}
		else 
			System.out.println ("Please enter valid Parameters.");
	}

 	//recover method is used to bring back the stuff that was hidden
	public void recover (int p1, int p2) {
		if (p1 >= 0 && p1 < p2 && p2 <= myCode.length()) {
			modifiedString.replace(p1, p2, myCode.substring(p1, p2));

			intermediateCode = modifiedString.toString();
			System.out.println (intermediateCode);
		}
		else
			System.out.println ("Please enter valid Parameters.");
	}
}