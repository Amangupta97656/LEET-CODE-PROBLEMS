class Solution {

    public int minCoins(int coins[], int sum) {
        int[] dp = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int coin : coins)
        {
            for(int j=coin;j<=sum;j++)
            {
                if(dp[j-coin]!=Integer.MAX_VALUE)
                {
                    dp[j] = Math.min(dp[j],1+dp[j-coin]);
                }
            }
        }
        return dp[sum]==Integer.MAX_VALUE?-1:dp[sum];
    }
}