class Solution {
    // Compute prefix sum of steps for [1..n]
    private long prefix(long n) {
        if (n <= 0) return 0;
        long sum = 0;
        long power = 1;   // 4^0
        int step = 1;
        
        while (power <= n) {
            long next = power * 4 - 1;  // end of current range
            long end = Math.min(n, next);
            long count = end - power + 1;
            sum += count * step;
            power *= 4;
            step++;
        }
        return sum;
    }

    public long minOperations(int[][] queries) {
        long total = 0;
        for (int[] q : queries) {
            long l = q[0], r = q[1];
            long steps = prefix(r) - prefix(l - 1);
            total += (steps + 1) / 2; // ceil division
        }
        return total;
    }
}