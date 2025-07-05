class Solution {
    public int findLucky(int[] arr) {
        int result = -1;

        // Map to store frequency of each number
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // Find the largest number whose frequency equals its value
        for (int i : freq.keySet()) {
            if (freq.get(i) == i && i > result) {
                result = i;
            }
        }

        return result;
    }
}