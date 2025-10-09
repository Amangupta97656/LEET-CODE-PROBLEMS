class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] ans = new long[n + 1];
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i - 1] + (long) skill[i - 1] * mana[0];
            sum += ans[i];
        }

        for (int i = 1; i < m; i++) {
            long prefix = 0;
            long valid = Long.MIN_VALUE;

            // compute directly without binary search
            for (int k = 1; k <= n; k++) {
                valid = Math.max(valid, ans[k] - prefix);
                prefix += (long) skill[k - 1] * mana[i];
            }

            ans[0] = valid;
            sum = 0;

            for (int k = 1; k <= n; k++) {
                ans[k] = ans[k - 1] + (long) skill[k - 1] * mana[i];
                sum += ans[k];
            }
        }

        return ans[n];
    }
}