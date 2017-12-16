public String repeatSeparator(String word, String sep, int count) {
  String resultString = "";
  for (int i = 0; i < count; i++)
    if (i == count - 1)
      resultString += word;
    else
      resultString = resultString + word + sep;
    
  return resultString;
}
