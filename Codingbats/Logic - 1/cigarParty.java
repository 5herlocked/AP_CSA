public boolean cigarParty(int cigars, boolean isWeekend) {
	if (cigars <= 60 && cigars >= 40 && !isWeekend)
		return true;
	if (cigars >= 40 && isWeekend)
		return true;
	return false;
}