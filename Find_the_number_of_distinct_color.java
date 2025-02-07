class Solution {
    public int[] queryResults(int limit, int[][] queries) {
 int[] result = new int[queries.length];
        Map<Integer, Integer> ballsColors = new HashMap<>();
        Map<Integer, Integer> colorsCounts = new HashMap<>();
        Integer ball;
        Integer color;
        Integer prevColor;
        for (int i = 0; i < queries.length; i++) {
            ball = queries[i][0];
            color = queries[i][1];
            prevColor = ballsColors.getOrDefault(ball, -1);
            ballsColors.put(ball, color);
            colorsCounts.merge(color, 1, Integer::sum);
            colorsCounts.merge(prevColor, -1, Integer::sum);
            if (colorsCounts.get(prevColor) < 1) {
                colorsCounts.remove(prevColor);
            }
            result[i] = colorsCounts.size();
        }
        return result;
    }
}