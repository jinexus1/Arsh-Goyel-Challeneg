class Solution {
  public int subarraySum(int[] nums, int target) {
    // Approach-1: Vrute force
    // int n=nums.length;
    // int sum=0,count=0;
    // for(int i=0;i<n;i++){
    // for(int j=i;j<n;j++){
    // sum=0;//important
    // for(int k=i;k<=j;k++){
    // sum=sum+nums[k];
    // }
    // if(sum==target)
    // count++;
    // }
    // }
    // return count++;
    // Approach-2:Cumulative Sum
    HashMap<Integer, Integer> mp = new HashMap<>();
    int result = 0;
    int cumSum = 0; // Cumulative sum
    mp.put(0, 1); // Initialize the map with cumSum 0 having 1 occurrence

    for (int i = 0; i < nums.length; i++) {
      cumSum += nums[i];
      if (mp.containsKey(cumSum - target)) {
        result += mp.get(cumSum - target);
      }
      mp.put(cumSum, mp.getOrDefault(cumSum, 0) + 1);
      // if it does not contains keep it in the map
    }
    return result;
  }
}