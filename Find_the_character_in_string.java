class Solution {
    public char kthCharacter(int k) {
        StringBuilder tobe = new StringBuilder("a");
        char start;
        while(tobe.length()<k){
            int n = tobe.length();
            for(int i = 0;i < n; i++){
                start = tobe.charAt(i);
               tobe = tobe.append(++start);
            }
        }
        return tobe.charAt(k-1);
    }
}