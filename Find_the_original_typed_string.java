class Solution {
    public int possibleStringCount(String word) {        
       int ans = 1;
        char prevChar = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == prevChar) {
                ans++;
            } else {
                prevChar = c;
            }
        }
        return ans;
    }
}