class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int  n = nums.length;
        int[][] q = new int[n][2];

        for (int i = 0; i < n; i++) {
            q[i][0] = i;
            q[i][1] = nums[i];
        }
            
        Arrays.sort(q, (x1, x2) -> x2[1] - x1[1]);


        Arrays.sort(q,0,k, (x1, x2) -> x1[0] - x2[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = q[i][1]; 
        }
        return res;
    }
}