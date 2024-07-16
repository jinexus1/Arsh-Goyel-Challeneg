//Brute force: Traversing complete array and find sum divisible by k
// class Solution {
//     public int subarraysDivByK(int[] nums, int t) {
//         //int sum=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=nums[k];
//                 }
//                 if(sum%t==0){
//                 count++;
//             }
//             }
//         }
//         return count;
//     }
// }
//Cumulative Sum Approach
// class Solution {
//     public int subarraysDivByK(int[] nums, int t) {
//         //int sum=0;
//         int count=0;
//         //cumulative sum
//         for(int i=1;i<nums.length;i++){
//             nums[i]=nums[i]+nums[i-1];
//         }
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int sum=i==0?nums[j]:nums[j]-nums[i-1];
//                 if(sum%t==0){
//                 count++;
//             }
//             }
//         }
//         return count;
//     }
// }
//Optimal Approach
class Solution {
  public int subarraysDivByK(int[] nums, int k) {
    int sum = 0;
    int result = 0;
    int rem = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();
    // Initialize
    mp.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      rem = sum % k;
      // If remainder is negative, adjust it to be within the range [0, k-1]
      if (rem < 0)
        rem = rem + k;
      // If the remainder has been seen before, it means there are subarrays
      // which sum to a multiple of k
      result = result + mp.getOrDefault(rem, 0);
      // Update the count of this remainder in the map
      mp.put(rem, mp.getOrDefault(rem, 0) + 1);
    }
    return result;
  }
}