import java.util.Arrays;

class Solution {
    // Helper to sort digits
    private String sortDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public boolean reorderedPowerOf2(int n) {
        String target = sortDigits(n);

        for (int i = 0; i < 31; i++) { // 2^30 > 1e9
            if (sortDigits(1 << i).equals(target)) {
                return true;
            }
        }
        return false;
    }
}