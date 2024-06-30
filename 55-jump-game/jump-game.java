class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        for(int i=0;i<nums.length;i++){
            if(i>reach) return false;
            if(reach >= nums.length-1) return true;
            if(reach<i+nums[i])
                reach = i+nums[i];
        }
        return false;
        
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp,-1);
        // return jump(nums, 0,dp);
    }
    
    // public boolean jump(int[] nums, int i,int[] dp){
    //     if(i>nums.length) return false;
    //     if(i == nums.length-1)
    //         return true;
    //     if(dp[i] != -1) return dp[i]==1?true:false;
    //     boolean pick=false;;
    //     if(i+nums[i]<nums.length){
    //     pick = jump(nums,i+nums[i],dp);}
    //     boolean notpick = jump(nums,i+1,dp);
    //     dp[i] = (pick|notpick)?1:0;
    //     return (pick|notpick);
    // }
}