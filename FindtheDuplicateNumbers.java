class Solution {
    public int findDuplicate(int[] nums) {
        //Approach 1: T.C(O(n)) ; S.C(O(n))
        // int len=nums.length;
        // //Constraint:nums.length == n + 1
        // int [] cnt=new int[len+1];
        // for(int i=0;i<len;i++){
        //     cnt[nums[i]]++;
        //     //if the number exist its count is greater than 1
        //     if(cnt[nums[i]]>1)
        //         return nums[i];
        // }
        // return 0;
        //Approach 2: Sort
        //Approach 3:HashSet
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                //if the numer exist it return false as set has no duplicate element
                //the negation make it positive ot true 
                return nums[i];
            }
        }
        return 1;
    }
}