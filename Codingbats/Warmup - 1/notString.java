public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equalsIgnoreCase("not"))
    return str;
  else
    return "not "+ str;
}
