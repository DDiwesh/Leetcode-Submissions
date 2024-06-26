class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        int cnt=0;
        int sindex=-1;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i), 0) + 1);
        }
        while(r<s.length()){
            char ch=s.charAt(r);
            if(mpp.containsKey(ch) && mpp.get(ch)>0){   
                cnt++;
            }
            mpp.put(ch,mpp.getOrDefault(ch,0)-1);            
            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sindex=l;
                }
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))+1);
                if(mpp.get(s.charAt(l))>0){
                    cnt--;
                }
                l++;
                }
            r++;
        }
        return sindex==-1?"":s.substring(sindex,sindex+minlen);
    }
}


// class Solution {
//     public String minWindow(String s, String t) {
//         HashMap<Character, Integer> mp = new HashMap<>();
//         for(int i=0;i<t.length();i++){
//             if(mp.containsKey(t.charAt(i))){
//                 mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
//             }else mp.put(t.charAt(i),1);
//         }
        
        
//         int l=0,r=0,n=s.length(),cnt=0,minlen=Integer.MAX_VALUE,si=-1;
        
//         while(r<n){
//              if(mp.containsKey(s.charAt(r))){
//                 if(mp.get(s.charAt(r))>0) cnt++;
//                 mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
//             }else mp.put(s.charAt(r),-1);
            
//             if(cnt== t.length()){
//                 if(r-l+1< minlen)
//                     minlen= r-l+1;
//                 si=l;
//                 mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
//                 if(t.indexOf(s.charAt(l))!=-1){
//                     cnt--;
//                 }
//                 l++;
//             }
//             r++;
//         }
        
//         return si==-1?"":s.substring(si,minlen);
        
//     }
// }
