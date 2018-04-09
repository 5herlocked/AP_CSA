public String mixString(String a, String b) {
	String resultString = "";
	for (int i = 0; i < Math.min(a.length(), b.length()); i++)
		resultString += "" + a.charAt(i) + b.charAt(i);
	
	if (a.length() > b.length())
		return resultString + a.substring(b.length());
	return resultString + b.substring(a.length());
}
