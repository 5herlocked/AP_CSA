public boolean nearHundred(int n) {
  if ((n >= (100 - 10) && n <= (100 + 10)) || (n >= (200 - 10) && n <= (200 + 10)))
    return true;
  
  return false;
}
