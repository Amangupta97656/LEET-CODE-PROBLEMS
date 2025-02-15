class Solution {
    public int punishmentNumber(int n) {
        int pn = 0;
        for(int i = 1; i <= n; i++){
            int prod = i * i;
            String s = prod + "";
            if(isPossible(s, 0, s.length() - 1, i))    pn += prod;
        }
        return pn;
    }
    private boolean isPossible(String s, int i, int j, int num){
        int n = 0;
        while(i <= j){
            n = n * 10 + (s.charAt(i) - '0');  
            if(isPossible(s, ++i, j, num - n)) return true;
        }
        return i > j && num == 0 && n == 0;
    }
}