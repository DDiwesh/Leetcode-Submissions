class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        HashMap<Integer,Integer> coinChange = new HashMap<>();
        coinChange.put(5,0);
        coinChange.put(10,0);
        coinChange.put(20,0);
        
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5)
                coinChange.put(5,coinChange.get(5)+1);
            else if(bills[i] == 10){
                if(coinChange.get(5)>=1){
                    coinChange.put(10,coinChange.get(10)+1);
                    coinChange.put(5,coinChange.get(5)-1);
                }else return false;
            }
            else if(bills[i] == 20){
                if(coinChange.get(5)>=1 && coinChange.get(10)>=1){
                    coinChange.put(20,coinChange.get(20)+1);
                    coinChange.put(10,coinChange.get(10)-1);
                    coinChange.put(5,coinChange.get(5)-1);
                }else if(coinChange.get(5)>=3){
                    coinChange.put(20,coinChange.get(20)+1);
                    coinChange.put(5,coinChange.get(5)-3);
                }
                else return false;
            }
        }
        return true;
        
    }
}