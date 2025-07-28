class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxor =0;
        for(int num:nums){
            maxor |= num;
        }
        int totalsubset = 1<<nums.length;
        int ans =0;
        for(int mask =0;mask<totalsubset;mask++){
            int curr=0;
            for(int i=0;i<nums.length;i++){
                if(((mask>>i)&1)==1){
                    curr|=nums[i];

                }
            }
            if(curr==maxor){
                ans++;
            }
        }
        return ans;
    }
}


//Finds the maximum bitwise OR (maxor) possible from any subset of the input array nums.

//Generates all possible subsets using bitmasking (total 2^n subsets for an array of size n).

//For each subset, calculates its bitwise OR.

//Counts how many subsets have a bitwise OR equal to the maxor.

//Returns that count.