class Solution {
    public boolean doesAliceWin(String s) {
        // s.toCharArray() converts the string into a list of  characters.
        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // If find even one vowel,Alice wins.
                return true;
            }
        }
        return false;
    }
}