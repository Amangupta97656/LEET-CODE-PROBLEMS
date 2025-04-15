class FenwickTree{
    private long[] fenw;
    private int n;

    public FenwickTree(int size){
        this.n = size;
        this.fenw = new long[size + 1]; 
    }
    public void update(int idx, long delta){
        idx++;
        while (idx <= n){
            fenw[idx] += delta;
            idx += idx & -idx;
        }
    }
    public long prefixSum(int idx){
        long res = 0;
        while (idx > 0){
            res += fenw[idx];
            idx -= idx & -idx;
        }
        return res;
    }
    public long countLess(int x){
        return prefixSum(x);
    }
}
class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long res = 0;

        int[] indices = new int[n];
        for(int i = 0; i < n; i++){
            indices[nums1[i]] = i;
        }
        for (int i = 0; i < n; i++){
            nums2[i] = indices[nums2[i]];
        }
        FenwickTree fenw = new FenwickTree(n);
        long processed = 0;
        for (int i = n - 1; i >= 0; i--){
            int num = nums2[i];
            long smallerCount = fenw.countLess(num);
            long biggerCount = processed - smallerCount;
            long diffCount = num - smallerCount;
            res += biggerCount * diffCount;
            fenw.update(num, 1);
            processed++;
        }
        return res;
    }
}