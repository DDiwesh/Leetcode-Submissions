class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = 0;
        int tsum = (l*(l+1))/2;
        for(int i:nums){
            sum += i;
        }
        return tsum - sum;
    }
}