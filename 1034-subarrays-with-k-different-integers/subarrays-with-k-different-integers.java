class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (sA(nums,k)-sA(nums,k-1));
    }
    
    public int sA(int[] nums, int k){
        int l=0,r=0,n=nums.length,cntSubarrays=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(r<n){
            if(mp.containsKey(nums[r])){
                mp.put(nums[r],mp.get(nums[r])+1);
            }else mp.put(nums[r],1);
            
            while(mp.size()>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l])==0) mp.remove(nums[l]);
                l++;
            }
            
            if(mp.size()<=k){
                cntSubarrays = cntSubarrays + r-l+1;
            }
            r++;
        }
        return cntSubarrays;
    }
}