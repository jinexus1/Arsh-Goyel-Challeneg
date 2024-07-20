class Solution {
  //Memoization and recursion approach
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
}
