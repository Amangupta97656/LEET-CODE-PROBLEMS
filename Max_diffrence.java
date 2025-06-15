class Solution {
    public int maxDiff(int num) {
        int mn = num, mx = num;
        int[] arr = toArray(num);
        boolean[] p = new boolean[10];
        for(int i : arr)p[i] = true;
        for(int i = 0; i<10; i++){
            if(!p[i])continue;
            for(int j = 0; j<10; j++){
                if(i==j)continue;
                int[] t = replace(arr, i, j);
                if(!isValid(t))continue;
                int x = toNumber(t);
                mn = Math.min(mn, x);
                mx = Math.max(mx, x);
            }
        }
        return mx - mn;
    }
    int len(int num){
        int ans = 0;
        while(num>0){
            ans++;
            num/=10;
        }
        return ans;
    }
    int[] toArray(int num){
        int n = len(num);
        int[] ans = new int[n];
        int i = n-1;
        while(num>0){
            ans[i--] = num%10;
            num /= 10;
        }
        return ans;
    }
    int toNumber(int[] arr){
        int n = arr.length, ans = 0;
        for(int i : arr){
            ans = 10*ans + i;
        }
        return ans;
    }
    boolean isValid(int[] num){
        return num[0] != 0;
    }
    int[] replace(int[] arr, int f, int t){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(arr[i] == f)ans[i] = t;
            else ans[i] = arr[i];
        }
        return ans;
    }
}