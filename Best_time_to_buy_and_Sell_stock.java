class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long prefix[] = new long[n + 1];
        prefix[0] = 0;

        // Get the prefix sum or the overall profit as of now
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + (prices[i] * strategy[i]);

        int i = 0;
        int j = k / 2;

        long canBe = 0;
        while (j < k) canBe += prices[j++]; // What can be the profit if applying strategy for the 1st window
        j--;

        long min = Integer.MAX_VALUE; // Will store the minimum loss till now who has the farthest profit
        long max = Integer.MIN_VALUE;
        long maxDiff = Integer.MIN_VALUE; // The farthest spike in profit seen till now

        while (j < n) {
            if (i > 0) {
                long next = prices[j]; // If applying startegy then what will be the addition in the window
                long pre = prices[j - k / 2]; // If moving window forward then we need to remove the one that will have 0 contribution in current window
                canBe = canBe + next - pre;
            }

            long curr = prefix[j + 1] - prefix[i]; // Get the current profit that is contirbuted by the current window

            // By applying the strategy on the current window, if we can get a contribution that is greater than the current one
            if (canBe > curr) {
                // Also if the spike in current loss and can be profit is greater that seen before
                if (canBe - curr > maxDiff) {
                    maxDiff = canBe - curr; // Greatest spike till now
                    min = curr;
                    max = canBe;
                }
            }

            i++;
            j++;
        }

        return Math.max (
            prefix[n],
            prefix[n] + max - min
        );
    }
}