class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return (nSubArry(nums,k)-nSubArry(nums,k-1));
    }
    
    public int nSubArry(int[] nums, int k){
        int l=0,r=0,n=nums.length,cnt=0,odd=0;
        while(r<n){
            if(isOdd(nums[r])){
                odd++;
            }
            while(odd>k){
                if(isOdd(nums[l])){
                    odd--;
                }
                l=l+1;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    
    public boolean isOdd(int num){
        return (num%2==1?true:false);
    }
}