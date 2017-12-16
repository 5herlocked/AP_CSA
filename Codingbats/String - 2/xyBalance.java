public boolean xyBalance(String str) {
	int locationY = 0;
	int locationX = 0;
	if (str.length() <= 1 && str.equals("x"))
		return false;
		
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == 'x')
			locationX  = i;
		if (str.charAt(i) == 'y')
			locationY = i;
	}
	
	if (locationX < locationY || locationX == locationY)
		return true;

	return false;
}