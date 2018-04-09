public boolean xyzThere(String str) {
	if (str.length() < 3)
		return false;
	if (str.length() == 3 && str.equals("xyz"))
		return true;
	for (int i = 0; i <= str.length() - 4; i++) {
		if (str.startsWith("xyz") || str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.')
			return true;
	}
	return false;
}
