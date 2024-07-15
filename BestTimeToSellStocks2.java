class Solution {
  public int maxProfit(int[] prices) {
    // Initialize
    int max = 0;
    int start = prices[0];
    for (int i = 0; i < prices.length; i++) {
      // when the price is greater than the start price
      // adding the difference to the max
      if (start < prices[i])
        max = max + (prices[i] - start);
      // if the prices[i] is less than or equal to start update
      // the start with prices[i]
      start = prices[i];
    }
    return max;
  }
}