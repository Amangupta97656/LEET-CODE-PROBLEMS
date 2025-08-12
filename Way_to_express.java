class Solution {
    int[][] dp;
    private static final int MOD=1000000007;
    public int numberOfWays(int n, int x) {
        dp=new int[n+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return helper(n,x,1);
    }
    public int helper(int n,int x,int ind){
        if(n==0){
            return 1;
        }
        int power=(int)Math.pow(ind,x)%MOD;
        if(n<0 || power>n){
            return 0;
        }
        if(dp[n][ind]!=-1){
            return dp[n][ind];
        }
        int not=helper(n,x,ind+1);
        int take=0;
        if(power<=n){
            take=helper(n-(int)Math.pow(ind,x),x,ind+1);
        }
        return dp[n][ind]= (take+not)%MOD;
    }
}