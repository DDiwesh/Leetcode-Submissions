class Solution {
    public int jump(int[] nums) {
        
        int n=nums.length,l=0,r=0,jumps=0;
        while(r<n-1){
            int farthest = 0;
            for(int i=l;i<=r;i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
//         int reach = 0, n=nums.length, count=0;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<=nums[i];j++){
//                 if(reach<j+nums[j]){
//                     reach = j+nums[j];
//                     count++;
//                 }
//                 if(reach >= n-1) return count;
//             }

//         }

//         return count;
    }
}