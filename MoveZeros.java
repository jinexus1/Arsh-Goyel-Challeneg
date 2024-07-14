class Solution {
  public void moveZeroes(int[] nums) {

    // fix the left pointer and then move the right pointer as soon as a zero is
    // encountered swap it with the left index element and then increment the left
    // pointer
    int n = nums.length;
    int left = 0, right = 0;
    for (right = 0; right < nums.length; right++) {
      if (nums[right] != 0) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        // just swap when the right is pointing to a non zero number
        left++;
      }
    }
  }
}