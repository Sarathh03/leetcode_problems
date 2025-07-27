class Solution {
    public int countHillValley(int[] nums) {
        int count=0,left =0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
            if((nums[i]>nums[left]&&nums[i]>nums[i+1])||
            (nums[i]<nums[left]&&nums[i]<nums[i+1])){
                count++;
            }
            left =i;
            }
        }
        return count;

    }
}




//skip consecutive duplicates by comparing the current element with the next one.
//use a left pointer to track the last distinct element before the current index.
//Now, check if the current element is greater than both neighbors ‘‘hill" or smaller than both ‘‘valley".
//If a hill or valley is found, increment count.
//Continue the process until the end of the array.//