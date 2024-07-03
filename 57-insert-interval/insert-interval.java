class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0,n=intervals.length;
        List<int[]> newintervalarr = new ArrayList<>();         
        //left
        while(i<n && intervals[i][1]<newInterval[0]){
            newintervalarr.add(intervals[i]);
            i++;
        }
        
        //overlapping
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        newintervalarr.add(newInterval);
        //right
        while(i<n){
            newintervalarr.add(intervals[i]);
            i++;
        }
        
        return newintervalarr.toArray(new int [0][]);
    }
}