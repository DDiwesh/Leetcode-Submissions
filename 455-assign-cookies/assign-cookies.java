class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,n=g.length;
        int r=0,m=s.length;
        while(l<n && r<m){
        if(s[r]>=g[l]){
            r++;
            l++;
            cnt++;
        }else if(s[r]<g[l]){
            r++;
        }
        }
        return cnt;
        
    }
}