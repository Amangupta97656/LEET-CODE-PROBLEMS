class Solution {
    long[][][][] dp;
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        dp = new long[n][k+1][2][2];
        for(int i=0;i<n;i++) for(int j=0;j<=k;j++) for(int l=0;l<2;l++) Arrays.fill(dp[i][j][l],-1);
        return helper(1,0,k,prices,0,n);
    }
    private long helper(int isCompleted,int isSell,int k,int[] prices,int idx,int n){
        if(idx==n || k == 0) return isCompleted == 1 ? 0 : Long.MIN_VALUE / 2; 
        // System.out.print(idx+" "+(k)+" "+(isSell)+" "+(isCompleted)+"\n");
        if(dp[idx][k][isCompleted][isSell] != -1) return dp[idx][k][isCompleted][isSell];
        // skip this day...
        long max=helper(isCompleted,isSell,k,prices,idx+1,n);
        if(isCompleted == 1){
            //  buy and sell....
            max = Math.max(
                max,
                Math.max(-prices[idx]+helper(0,1,k,prices,idx+1,n),prices[idx]+helper(0,0,k,prices,idx+1,n))
            );
        }
        else{     
            if(isSell==0) max = Math.max(
                max,
                -prices[idx]+helper(1,1,k-1,prices,idx+1,n)
                
            );
            else max = Math.max(
                max,
                prices[idx]+helper(1,0,k-1,prices,idx+1,n)
            );
        }
        return dp[idx][k][isCompleted][isSell]=max;
    }
}