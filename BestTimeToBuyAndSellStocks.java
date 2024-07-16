//Brute force(calculating all profits)
// class Solution {
//     public int maxProfit(int[] a) {
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//         for(int j=i+1;j<a.length;j++){
//             int diff=a[j]-a[i];
//             if(diff>max){
//                 max=diff;
//             }
//         }
//        } 
//        if(max<0)
//         return 0;
//        return max;
//     }
// }
class Solution {
  public int maxProfit(int[] a) {
    int profit = 0;
    int buy = a[0];
    for (int i = 0; i < a.length; i++) {
      // if the buy price is greater initially so
      // update the buy price as a[i]
      if (a[i] < buy) {
        buy = a[i];
      } // if the diff of profit is greater than previous profit
        // then update the profit
      else if (a[i] - buy > profit)
        profit = a[i] - buy;
    }
    return profit;
  }
}
