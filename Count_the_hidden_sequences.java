class Solution {
    public int numberOfArrays(int[] dif, int lower, int upper) {
        int max =0;
        int min =0;
        int cur =0;
        for(int d : dif){
            cur += d;
            min = Math.min(min,cur);
            max = Math.max(max,cur);
            if((upper-max)-(lower-min)+1<=0){
                return 0;
            }
        }
        return (upper-max)-(lower-min)+1;
    }
}