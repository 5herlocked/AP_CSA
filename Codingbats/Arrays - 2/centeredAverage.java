public int centeredAverage(int[] nums) {
  int sum = 0;
  for (int i : nums)
    sum+=i;
  int max = nums[0];
  int min = nums[0];
  
  for (int i:nums) {
    if (i > max)
      max = i;
    else if (i < min)
      min = i;
  }
  int centeredAvg = (sum - max - min)/(nums.length-2);
  
  return centeredAvg;
}
