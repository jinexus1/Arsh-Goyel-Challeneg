class Solution {

  public void swap(int a, int b, int[] nums) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int j = 0;
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[j++];
    }

    int gap = (m + n) / 2;
    while (gap != 0) {
      for (int i = 0; i < nums1.length; i = i + 1) {
        // we compare pairs at gap
        if (i + gap < nums1.length && nums1[i] > nums1[i + gap]) {
          swap(i, i + gap, nums1);
        }
      }
      gap = gap - 1;
    }
  }
}