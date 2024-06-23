class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return (numArray(nums,goal)-numArray(nums,goal-1));
    }
    
    public int numArray(int[] num, int goal){
        if(goal<0) return 0;
        int n = num.length, count = 0, l = 0, r=0,sum=0;
        while(r<n){
            sum += num[r];
            while(sum > goal){
                sum -= num[l];
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}