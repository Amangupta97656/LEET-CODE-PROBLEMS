class Solution {
    public int maxPartitionsAfterOperations(String s, int k) {
      int n = s.length();
        Map<Long, Integer> memo = new HashMap<>();
        return dfs(s, 0, 0, 0, k, memo);
    }

    private int dfs(String s, int i, int mask, int changed, int k, Map<Long, Integer> memo) {
        if (i == s.length()) return 1;

        long key = (((long) i) << 40) | (((long) mask) << 1) | changed;
        if (memo.containsKey(key)) return memo.get(key);

        int ch = s.charAt(i) - 'a';
        int res = 0;

     
        int newMask = mask | (1 << ch);
        if (Integer.bitCount(newMask) > k) {
            res = Math.max(res, 1 + dfs(s, i + 1, 1 << ch, changed, k, memo));
        } else {
            res = Math.max(res, dfs(s, i + 1, newMask, changed, k, memo));
        }

      
        if (changed == 0) {
            for (int c = 0; c < 26; c++) {
                if (c == ch) continue;
                int m = mask | (1 << c);
                if (Integer.bitCount(m) > k) {
                    res = Math.max(res, 1 + dfs(s, i + 1, 1 << c, 1, k, memo));
                } else {
                    res = Math.max(res, dfs(s, i + 1, m, 1, k, memo));
                }
            }
        }

        memo.put(key, res);
        return res;
    }
}