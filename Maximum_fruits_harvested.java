import java.util.Arrays;

class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        Arrays.sort(fruits, (a, b) -> Integer.compare(a[0], b[0])); // Ensure sorted
        int max = 0, sum = 0, l = 0;

        for (int r = 0; r < fruits.length; r++) {
            sum += fruits[r][1];

            while (l <= r && !canReach(fruits[l][0], fruits[r][0], startPos, k)) {
                sum -= fruits[l][1];
                l++;
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    public boolean canReach(int left, int right, int start, int k) {
        if (right <= start) return start - left <= k;
        if (left >= start) return right - start <= k;

        int leftDist = start - left;
        int rightDist = right - start;
        int minSteps = Math.min(2 * leftDist + rightDist, 2 * rightDist + leftDist);

        return minSteps <= k;
    }
}