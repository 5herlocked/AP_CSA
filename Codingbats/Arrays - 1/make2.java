public int[] make2(int[] a, int[] b) {
  int[] returnArray = new int[2];
  int countAdded=0;
  int aAdded=0;
  while (countAdded < 2 && aAdded < a.length){
    if (a.length > 0){
      returnArray[countAdded] = a[countAdded];
      countAdded++;
      aAdded++;
    }
  }
  while (countAdded < 2){
    if (b.length > 0){
      returnArray[countAdded] = b[countAdded-aAdded];
      countAdded++;
    }
  }
  return returnArray;
}