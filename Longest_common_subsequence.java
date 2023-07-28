class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        if(n == 0 || m == 0){
            return 0;
        }
        int[] dp = new int[m];
        dp[0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
        for(int j = 1; j < m; j++){
            dp[j] = text1.charAt(0) == text2.charAt(j) ? 1 : dp[j - 1];
        }

        for(int i = 1; i < n; i++){
            int oldValue = dp[0];
            dp[0] = text1.charAt(i) == text2.charAt(0) ? 1 : dp[0];
            for(int j = 1; j < m; j++){
                int a = dp[j];
                dp[j] = text1.charAt(i)== text2.charAt(j) ? 1 + oldValue : Math.max(dp[j - 1], dp[j]);
                oldValue = a;
            }
        }
        return dp[m - 1];
    }
}