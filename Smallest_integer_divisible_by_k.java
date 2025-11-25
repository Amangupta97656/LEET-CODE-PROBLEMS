class Solution {
    public int smallestRepunitDivByK(int k) {
        // If k has factors 2 or 5, no repunit can be divisible
        if (k % 2 == 0 || k % 5 == 0)
            return -1;

        int remain = 1, count = 1;

        while (remain % k != 0) {
            remain = (remain * 10 + 1) % k;
            count++;
        }

        return count;
    }
}