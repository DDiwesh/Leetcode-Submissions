class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(mp.containsKey(rem)){
                arr[0] = i;
                arr[1] = mp.get(rem);
            }else{
                mp.put(nums[i],i);
            }
        }
        
        return arr;
        
        
    }
}