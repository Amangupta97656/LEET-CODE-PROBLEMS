class Solution {

    public static int solve(int[][] dp  , int[] arr , int len, int amount)
    {
        if(amount == 0)
            return 0;
        if(len == 0)
            return 100000;
        if(dp[len][amount] != -1)
            return dp[len][amount];
        int take = 100000;
        if(arr[len-1] <= amount)
            take = solve(dp , arr , len , amount-arr[len-1]);
        int not_take = solve(dp , arr , len-1 , amount);
        dp[len][amount] = Math.min(take+1 , not_take);
        return dp[len][amount];
    }

    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int dp[][] = new int[len+1][amount+1];
        for(int[] x : dp)
            Arrays.fill(x,-1);
        int ans = solve(dp , coins , len , amount);
        if(ans >= 100000)
            return -1;
        return ans;
    }
}