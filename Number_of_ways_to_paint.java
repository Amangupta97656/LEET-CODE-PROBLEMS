class Solution {
    public int numOfWays(int n) {
        int MOD = 1000000007;
        long typeA = 6;    // 6 possibilty for all different
        long typeB = 6;    // 6 possibility for 1, 3 same

        for (int i = 2; i <= n; i++) {
            long newA = (2 * typeA + 2 * typeB) % MOD;
            long newB = (2 * typeA + 3 * typeB) % MOD;

            typeA = newA;
            typeB = newB;
        }

        return (int) ((typeA + typeB) % MOD);
    }
}