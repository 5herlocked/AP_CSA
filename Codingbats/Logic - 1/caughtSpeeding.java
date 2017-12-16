public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday){
    if (speed <= 65)
      return 0;
    else if (speed <= 85 && speed >= 66)
      return 1;
    else if (speed >= 86)
      return 2; 
  }
  else {
    if (speed <= 60)
      return 0;
    else if (speed <= 80 && speed >= 61)
      return 1;
    else if (speed >= 81)
      return 2;
  }
  
  return 0;
}