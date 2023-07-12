class Solution {
    public int alternatingSubarray(int[] A) {
        int n = A.length, res = 0, j = 0;
        for (int i = 0; i < n; ++i)
            for (j = i + 1; j < n && A[j] == A[i] + (j - i) % 2; ++j)
                res = Math.max(res, j - i + 1);
        return res > 1 ? res : -1;
    }
}