class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int left_sum = target - nums[i];
      if (mp.containsKey(left_sum)) {
        // converting the map into int
        // i th location of element is the location of element
        // whoes addition with the left_sum return the target
        return new int[] { mp.get(left_sum), i };
      } // if the nums[i] does not exit in the map
      mp.put(nums[i], i);
    }
    return new int[] {};
  }
}