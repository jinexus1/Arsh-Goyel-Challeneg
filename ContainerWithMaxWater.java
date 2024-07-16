//Approach:Greedly inceasing the height when width decreases
class Solution {
  public int maxArea(int[] height) {
    int i = 0, j = height.length - 1;
    int Max_water = 0;
    while (i < j) {
      int high = Math.min(height[i], height[j]);
      int width = j - i;
      int area = high * width;
      Max_water = Math.max(area, Max_water);
      // if height[j] is less than height[i] then ignore height[j]
      if (height[j] < height[i])
        j--;// ignoring j
      else
        i++;
    }
    return Max_water;
  }
}