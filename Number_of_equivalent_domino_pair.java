public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int key = a < b ? a * 10 + b : b * 10 + a;
            count += freq.getOrDefault(key, 0);
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}