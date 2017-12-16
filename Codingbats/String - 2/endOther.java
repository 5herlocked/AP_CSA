public boolean endOther(String a, String b) {
	if (a.length() < b.length()) {
		if (b.substring(b.length() - a.length()).equalsIgnoreCase(a))
			return true;
	}
	else {
		if (a.substring(a.length() - b.length()).equalsIgnoreCase(b))
			return true;
	}
	return false;
}
