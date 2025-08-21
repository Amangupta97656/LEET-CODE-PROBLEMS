class Solution {
    public int numSubmat(int[][] mat) {
           int m = mat.length, n = mat[0].length;
        int result = 0;

        // Step 1: Build histogram for each row
        // heights[j] represents the number of consecutive 1s up to current row at column j
        int[] heights = new int[n];

        for (int i = 0; i < m; i++) {
            // Update histogram heights for current row
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    heights[j] = 0;
                } else {
                    heights[j] += 1;
                }
            }

            // Step 2: Count submatrices ending at this row
            result += countSubmatrices(heights);
        }

        return result;
    }

    // Helper function: Count submatrices using current histogram heights
    private int countSubmatrices(int[] heights) {
        int n = heights.length;
        int res = 0;

        // For each column, expand leftwards and calculate possible rectangles
        for (int j = 0; j < n; j++) {
            int minHeight = heights[j];
            for (int k = j; k >= 0 && minHeight > 0; k--) {
                minHeight = Math.min(minHeight, heights[k]);
                res += minHeight; // add submatrices of width (j-k+1) and minHeight
            }
        }
        return res;
    }
}