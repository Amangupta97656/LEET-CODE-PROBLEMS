class Solution {
    public boolean isInside(int[] rect, int[] xy) {
        // x1, y1 - left, bottom
        // x2, y2 - right, top
        int x1 = rect[0], x2 = rect[2], y1 = rect[1], y2 = rect[3], x = xy[0], y = xy[1];

        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) return true;
        return false;
    }

    public int numberOfPairs(int[][] points) {
        int count = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                // first point should be top, left
                // Second should be bottom, right
                int[] first = points[i], second = points[j];
                if (
                    i == j ||
                    !(first[0] <= second[0] && first[1] >= second[1])
                ) continue;

                int[] rect = {
                    Math.min(first[0], second[0]),
                    Math.min(first[1], second[1]),
                    Math.max(first[0], second[0]),
                    Math.max(first[1], second[1]),
                };
                // Flag for collision with at least one other point besides i, j
                boolean collision = false;

                for (int k = 0; k < points.length; k++) {
                    if (k == i || k == j) continue;
                    if (!isInside(rect, points[k])) continue;
                    collision = true;
                    break;
                }

                if (collision) continue;
                count++;
            }
        }

        return count;
    }
}