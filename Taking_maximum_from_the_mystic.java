class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, m = n-k, max = -1000;
        for (int i = m; i < n; i++) {
            for (int j = i, tmp = 0; j > -1; j -= k) {
                tmp += energy[j];
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        
        return max;
    }
}