int n = scanner.nextInt();
int [] [] = new int [n] [m];
for(int i=0;i<m;i++){
  for(int j=0;j<m;j++){
    ar[i][j] = scanner.nextInt();
  }
}

for(int i=0;i<m;i++){
   for(int j=0;j<n;j++){
      System.out.print(ar[i][j]+" ");
    }
      System.out.println();
}class Solution {
    public int numTilings(int n) {
        
        final int kMod = 1_000_000_007;

            long[] dp = new long[1001];
                dp[1] = 1;
                    dp[2] = 2;
                        dp[3] = 5;

                            for (int i = 4; i <=n; ++i)
                                  dp[i] = (2 * dp[i - 1] + dp[i - 3]) % kMod;

                                      return (int) dp[n];
    }
}