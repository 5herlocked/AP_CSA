public String repeatFront(String str, int n) {
	String returnString = "";
	for (int i = 0;  i <= n; i++) {
		returnString += str.substring(0, n - i);
	}
	return returnString;
}
