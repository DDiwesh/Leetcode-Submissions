class Solution {
    public boolean checkValidString(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        char[] ch = s.toCharArray();
        return checkValid(ch,0,0,dp);
        
    }
    
    public boolean checkValid(char[] c, int openCount, int i, int[][] valid){
        if(i == c.length){
            return openCount == 0;
        }
        if(valid[i][openCount] != -1) return valid[i][openCount]==1;
        
        boolean isValid = false;
        if(c[i] == '*'){
            isValid = isValid | checkValid(c,openCount+1,i+1,valid);
            if(openCount > 0)
                isValid = isValid | checkValid(c,openCount-1,i+1,valid);
            isValid = isValid | checkValid(c,openCount,i+1,valid);
        }else{
            if(c[i] == '('){
                isValid = isValid | checkValid(c,openCount+1,i+1,valid);
            }else if(openCount>0){
                isValid |= checkValid(c,openCount-1,i+1,valid);
            }
        }
        
        valid[i][openCount] = isValid?1:0;
        return isValid;
    }
}