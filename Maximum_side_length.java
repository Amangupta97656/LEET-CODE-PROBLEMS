class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length, ans = 0;
 
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1] 
                    + prefix[i - 1][j]
                    + prefix[i][j - 1]
                    - prefix[i - 1][j - 1];
            }
        }

        int left = 0, right = Math.min(m, n);

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (can_find_square(prefix, mid, n, m, threshold)) {
                ans = mid;

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public boolean can_find_square(int[][] prefix, int k, int n, int m, int threshold) {
        if (k == 0) return true;

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                int sum = prefix[i + k][j + k]
                    - prefix[i + k][j]
                    - prefix[i][j + k]
                    + prefix[i][j];

                if (sum <= threshold) return true;
            }
        } 

        return false;
    }
}