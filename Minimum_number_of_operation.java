class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0, x = 0;
        for (int i = 0; i < n; i++) {
            res[i] = count;
            x += boxes.charAt(i) - '0';
            count += x;
        }
        count = 0;
        x = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[i] += count;
            x += boxes.charAt(i) - '0';
            count += x;
        }
        return res;
    }
}