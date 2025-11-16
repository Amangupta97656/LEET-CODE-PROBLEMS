class Solution {
    int MOD = 1000000007;
    public int numSub(String s) {
        int n = s.length();
        long ans = 0;
        int l=0,r=0;
        while(l<n){
            long temp = 0;
            r=l;
            if(s.charAt(l)=='1'){
                while(r<n && s.charAt(r)=='1'){
                    temp++;
                    r++;
                }
                ans = ans+(temp*(temp+1))/2;
                l=r;
            }
            l++;
        }
        return (int)(ans%MOD);
    }
}