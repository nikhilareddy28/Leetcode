class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int windowsum=nums[0];
        for(int i=1;i<nums.length;i++){
            windowsum=Math.max(nums[i],windowsum+nums[i]);
            maxsum=Math.max(maxsum ,windowsum);
        }
        return maxsum;
        
        
    }
}