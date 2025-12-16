import java.util.*;

class Solution {

    static final int NEG = Integer.MIN_VALUE / 4;

    int n, budget;
    int[] present, future;
    List<Integer>[] children;

    // dp[node][bossBuy][buy][budget]
    int[][][][] dp;
    boolean[][][] vis;

    public int maxProfit(
            int n,
            int[] present,
            int[] future,
            int[][] hierarchy,
            int budget
    ) {
        this.n = n;
        this.present = present;
        this.future = future;
        this.budget = budget;

        children = new ArrayList[n];
        for (int i = 0; i < n; i++) children[i] = new ArrayList<>();

        for (int[] e : hierarchy) {
            children[e[0] - 1].add(e[1] - 1);
        }

        dp = new int[n][2][2][budget + 1];
        vis = new boolean[n][2][2];

        // initialize dp with NEG
        for (int i = 0; i < n; i++)
            for (int b1 = 0; b1 < 2; b1++)
                for (int b2 = 0; b2 < 2; b2++)
                    Arrays.fill(dp[i][b1][b2], NEG);

        // root: no boss, can choose buy or not
        dfs(0, 0, 0);
        dfs(0, 0, 1);

        int ans = 0;
        for (int b = 0; b <= budget; b++) {
            ans = Math.max(ans,
                    Math.max(dp[0][0][0][b], dp[0][0][1][b]));
        }
        return ans;
    }

    private void dfs(int node, int bossBuy, int buy) {
        if (vis[node][bossBuy][buy]) return;
        vis[node][bossBuy][buy] = true;

        int[] cache = dp[node][bossBuy][buy];
        Arrays.fill(cache, NEG);

        // cost calculation
        int cost = 0;
        if (buy == 1) {
            cost = bossBuy == 1 ? present[node] / 2 : present[node];
        }

        if (cost <= budget) {
            cache[cost] = buy == 1
                    ? future[node] - cost
                    : 0;
        }

        int[] cur = new int[budget + 1];
        int[] merged = new int[budget + 1];
        System.arraycopy(cache, 0, cur, 0, budget + 1);

        for (int child : children[node]) {

            // child buys
            dfs(child, buy, 1);

            // child skips
            dfs(child, 0, 0);

            int[] take = dp[child][buy][1];
            int[] skip = dp[child][0][0];

            Arrays.fill(merged, NEG);

            for (int b = 0; b <= budget; b++) {
                if (cur[b] == NEG) continue;
                for (int x = 0; b + x <= budget; x++) {
                    int best = Math.max(take[x], skip[x]);
                    if (best != NEG) {
                        merged[b + x] = Math.max(
                                merged[b + x],
                                cur[b] + best
                        );
                    }
                }
            }
            System.arraycopy(merged, 0, cur, 0, budget + 1);
        }

        System.arraycopy(cur, 0, cache, 0, budget + 1);
    }
}