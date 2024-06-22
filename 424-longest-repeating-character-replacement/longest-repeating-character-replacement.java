class Solution {
    public int characterReplacement(String s, int k) {
     
        char[] ch = s.toCharArray();
        int n = s.length(),maxfreq =0,maxL=0,r=0,l=0;
        HashMap<Character, Integer> mp = new HashMap<>();
        while(r<n){
             if(mp.containsKey(ch[r]))
                    mp.put(ch[r],mp.get(ch[r])+1);
                else
                    mp.put(ch[r],1);
            maxfreq = Math.max(maxfreq, mp.get(ch[r]));
            int changes = (r-l+1) - maxfreq;
            if(changes > k){
                while((r-l+1-maxfreq)>k){
                    mp.put(ch[l],mp.get(ch[l])-1);
                    maxfreq = 0;
                    for(Map.Entry<Character, Integer> m:mp.entrySet()){
                        maxfreq = Math.max(maxfreq, m.getValue());
                    }
                    if(mp.get(ch[l])==0)
                        mp.remove(ch[l]);
                    l++;
                }
            }if((r-l+1-maxfreq)<=k){
                maxL = Math.max(maxL, r-l+1);
            }
            r++;
        }
        return maxL;
    }
}