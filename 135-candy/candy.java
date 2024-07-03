class Solution {
    public int candy(int[] rating) {
        int candy = 1,n=rating.length,i=1;
        while(i<n){
            if(rating[i] == rating[i-1]){
                candy = candy+1;
                i++;
                continue;
            }
            int peak =1 ;
            while(i<n && rating[i]> rating[i-1]){
                peak +=1;
                candy += peak;
                i++;
            }
            
            int down = 1;
            while(i<n&& rating[i]<rating[i-1]){
                candy += down;
                down +=1;
                i++;
            }
            if(down > peak){
                candy = candy + (down-peak);
            }
        }
        return candy;
    }
}