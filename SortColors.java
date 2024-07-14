class Solution {
  public void sortColors(int[] nums) {
    // Approach 1: sort
    /// Arrays.sort(nums);
    // Appproach 2: Count each and the iterate over it
    int zeros = 0, ones = 0, n = nums.length;
    for (int num : nums) {
      if (num == 0)
        zeros++;
      else if (num == 1)
        ones++;
    }

    for (int i = 0; i < zeros; ++i) {
      nums[i] = 0;
    }

    for (int i = zeros; i < zeros + ones; ++i) {
      nums[i] = 1;
    }

    for (int i = zeros + ones; i < n; ++i) {
      nums[i] = 2;
    }
  }
}