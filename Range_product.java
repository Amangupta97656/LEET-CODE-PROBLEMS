class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod7 = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if (((1 << i) & n) != 0)
                powers.add(1 << i);
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            long product = 1;

            for (int j = left; j <= right; j++) {
                product = (product * powers.get(j)) % mod7;
            }

            answer[i] = (int) product;
        }
        return answer;
    }
}