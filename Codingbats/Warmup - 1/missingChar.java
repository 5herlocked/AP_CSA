public String missingChar(String str, int n) {
	StringBuilder string = new StringBuilder(str);
	string.deleteCharAt(n);
	return string.toString();
}