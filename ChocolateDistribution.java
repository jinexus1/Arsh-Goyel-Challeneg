class Solution {
  public long findMinDiff(ArrayList<Integer> a, int n, int m) {
    // your code here
    // Sort the ArrayList
    Collections.sort(a);
    long min_diff = Integer.MAX_VALUE;
    for (int i = m - 1; i < a.size(); i++) {
      if (a.get(i) - a.get(i - m + 1) < min_diff) {
        min_diff = a.get(i) - a.get(i - m + 1);
      }
    }
    return min_diff;
  }
}