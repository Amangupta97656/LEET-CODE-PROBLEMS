class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
            List<List<Integer>> ans=new ArrayList<>();
            boolean[]primes=sieveOfEratosthenes(n);
            int[]vis=new int[n+1];
        for(int i=1;i<=n;i++)
        {
                if((n-i)<=n && (n-i)>0 && primes[i] && primes[n-i] && vis[i]!=1 && vis[n-i]!=1)
                {
                        ans.add(new ArrayList<>(Arrays.asList(i,n-i)));
                        vis[i]=1;
                        vis[n-i]=1;
                }
        }
            Collections.sort(ans, (a, b) -> Integer.compare(a.get(0),b.get(0)));
            return ans;
            
        }

    public static boolean[] sieveOfEratosthenes(int n) 
     {
         boolean[] primes = new boolean[n + 1];
         Arrays.fill(primes, true);
         primes[0] = primes[1] = false;

        for (int p = 2;p <= n; p++) {
          if (primes[p] && (long)p*p<=n) {
            for (int  i = p * p; i <= n; i += p) {
                 primes[i] = false;
                       }
                 }
           }

    return primes;
     }
}