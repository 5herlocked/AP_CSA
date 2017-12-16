public String alarmClock(int day, boolean vacation) {
  if (vacation){
    if (day <= 5 && day >= 1)
      return "10:00";
    else 
      return "off";
  }
  else if (day <= 5 && day >= 1)
    return "7:00";
  
  return "10:00";
}