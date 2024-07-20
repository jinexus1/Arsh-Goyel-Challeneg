class Solution {
    public int majorityElement(int[] nums) {
        //Sorting Approach
        // int temp=nums.length/2;
        // Arrays.sort(nums);
        // return nums[temp];
        //HashMap Approach: Calculating frequency of each element
        // int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        
        // for (int i = 0; i < n; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // int maxCount = 0;
        // int maxElement = nums[0];
        //  for (int num : nums) {
        //     if (map.get(num) > maxCount) {
        //         maxCount = map.get(num);
        //         maxElement = num;
        //     }
        // }
        
        // return maxElement;
        //HashMap without any extra space
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;       
    }
}