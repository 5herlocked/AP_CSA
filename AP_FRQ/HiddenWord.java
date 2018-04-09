public class HiddenWord {
	private char[] hideString;

	public HiddenWord (String hideString) {
		this.hideString = hideString.toCharArray(); 
	}

	public String gethint (String attemptString) {
		StringBuilder hintString = new StringBuilder();

		for (int i = 0; i < attemptString.length(); i++){
			if (attemptString.charAt(i) == hideString[i])
				hintString.append(hideString[i]);
			else if (new String(hideString).contains(String.valueOf(attemptString.charAt(i))))
				hintString.append("+");
			else
				hintString.append("*");
		}
		return hintString.toString();
	}
}