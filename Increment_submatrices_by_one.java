class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] inc = new int[n][n];   // difference matrix

        // Apply difference updates row-wise
        for (int[] q : queries) {
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];

            for (int r = r1; r <= r2; r++) {
                inc[r][c1] += 1;
                if (c2 + 1 < n) {
                    inc[r][c2 + 1] -= 1;
                }
            }
        }

        // Prefix accumulation across each row
        for (int r = 0; r < n; r++) {
            for (int c = 1; c < n; c++) {
                inc[r][c] += inc[r][c - 1];
            }
        }

        return inc;
    }
}
