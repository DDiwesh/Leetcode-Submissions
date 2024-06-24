
class Solution {
    public int numberOfSubstrings(String s) {
       char[] charArr = s.toCharArray();
        int n = s.length(),count=0;
        int[] lastSeen = new int[]{-1,-1,-1};
        
        for(int i=0;i<n;i++){
            lastSeen[charArr[i]-'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count = count + 1 + Math.min(lastSeen[1],Math.min(lastSeen[0],lastSeen[2]));
            }
        }
        return count;
    }
}