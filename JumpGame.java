class Solution {
  // Boolean[] memo; // Using Boolean instead of int for memoization

  // boolean solve(int[] nums, int n, int index) {
  // if (index >= n - 1) {
  // return true; // Reached or surpassed the last index
  // }
  // if (nums[index] == 0 && index!=n-1) {
  // return false; // Can't move forward if the current number is 0
  // }
  // if (memo[index] != null) {
  // return memo[index]; // Return already computed result
  // }

  // for (int i = 1; i <= nums[index]; i++) { // Start from 1 instead of 0
  // if (solve(nums, n, index + i)) {
  // return memo[index] = true; // Memoize and return true
  // }
  // }
  // return memo[index] = false; // Memoize and return false
  // }

  // public boolean canJump(int[] nums) {
  // int n = nums.length;
  // memo = new Boolean[n]; // Initialize memo array with nulls
  // return solve(nums, n, 0);
  // }
  // Bottom up
  // public boolean canJump(int[] nums) {
  // int n = nums.length;
  // boolean t[]=new boolean[n];
  // t[0]=true;
  // for(int i=0;i<n;i++){
  // for(int j=i-1;j>=0;j--){
  // if(t[j]==true && j+nums[j]>=i){
  // t[i]=true;
  // break;
  // }
  // }
  // }
  // return t[n-1];
  // }
  public boolean canJump(int[] nums) {
    int n = nums.length;
    int maxReachable = 0;
    for (int i = 0; i < n; i++) {
      if (i > maxReachable) {
        return false;
      }
      maxReachable = Math.max(maxReachable, i + nums[i]);
    }
    return true;
  }
}
