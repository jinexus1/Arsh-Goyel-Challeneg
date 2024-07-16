class Solution {
  private void twoSum(int[] nums, int target, int start, int end, List<List<Integer>> ans) {
    int i = start;
    int j = end;

    while (i < j) {
      int sum = nums[i] + nums[j];
      if (sum > target) {
        j--;
      } else if (sum < target) {
        i++;
      } else {
        ans.add(Arrays.asList(-target, nums[i], nums[j]));
        i++;
        j--;

        // Skip duplicates for nums[i]
        while (i < j && nums[i] == nums[i - 1])
          i++;

        // Skip duplicates for nums[j]
        while (i < j && nums[j] == nums[j + 1])
          j--;
      }
    }
  }

  public List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();

    if (n < 3) {
      return ans;
    }

    // Sorting
    Arrays.sort(nums);

    // Fixing the first number
    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int target = -nums[i];
      twoSum(nums, target, i + 1, n - 1, ans);
    }

    return ans;
  }
}