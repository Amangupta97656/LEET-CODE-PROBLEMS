
class Solution {
    public int countTrapezoids(int[][] points) {
        // Count number of y points, and freq of them
        Map<Integer, Integer> pointCount = new HashMap<>();

        final int mod = 1000000007; // used to return large numbers 
        long ans = 0;
        long sum = 0;

        // group the amount of y values and count of y occurences
        for(int[] point : points) {
            pointCount.put(point[1], pointCount.getOrDefault(point[1], 0) + 1);
        }

        // for each value in the HashMap, multiply current edge
        // by edge seen before
        for(int pNum : pointCount.values()) {
            long edge = ((long)pNum * (pNum - 1)) / 2; // case: first edge = 3
            ans = (ans + edge * sum) % mod; // 0 + 3 * 0 = 0
            sum = (sum + edge) % mod; // output = 3

        }

        //return ans as an int
        return (int) ans;
    }
}