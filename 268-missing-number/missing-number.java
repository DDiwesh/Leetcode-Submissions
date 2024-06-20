class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int[] count = new int[l+1];
        for(int i=0;i<l;i++){
            count[nums[i]] = 1;
        }

        for(int i=0;i<=l;i++){
            if(count[i] != 1)
                return i;
        }

        return -1;
        
    }
}