public String repeatEnd(String str, int n) {
	String returnString = "";
	for (int i = 0; i < n; i++) {
		returnString += str.substring (str.length() - n);
	}

	return returnString;
}
