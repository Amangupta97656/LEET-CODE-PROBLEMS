class Solution {
    public int helper(String s, String t,int i,String p,int dp[][])
    {
        if(i>=s.length())
        {
            if(t.equals(p))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(p.length()>t.length())
        {
            return 0;
        }
        if(p!="")
        {
            if(!(p.equals(t.substring(0,p.length()))))
            {
                return 0;
            }
        }
        if(dp[i][p.length()]!=-1)
          return dp[i][p.length()];

        int x=helper(s,t,i+1,p+s.charAt(i),dp);
        int y=helper(s,t,i+1,p,dp);

        return dp[i][p.length()]=x+y;
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()+1];
         Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(s,t,0,"",dp);
    }
}