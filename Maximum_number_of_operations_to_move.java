class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int count_1 = 0;
        boolean prev_is_1 = false;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count_1 ++;
                prev_is_1 = true;
            } else if (prev_is_1) {
                res += count_1;
                prev_is_1 = false;
            }
        }
        return res;
    }
}