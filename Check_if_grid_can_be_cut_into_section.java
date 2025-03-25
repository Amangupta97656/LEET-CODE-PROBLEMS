class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> xIntervals = new ArrayList<>();
        List<int[]> yIntervals = new ArrayList<>();

        for(int[] rect : rectangles) {
            xIntervals.add(new int[]{rect[0], rect[2]});
            yIntervals.add(new int[]{rect[1], rect[3]});
        }

        Collections.sort(xIntervals, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        Collections.sort(yIntervals, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int xMerged = mergeIntervals(xIntervals);
        if(xMerged >= 3) {
            return true;
        }

        int yMerged = mergeIntervals(yIntervals);
        if(yMerged >= 3) {
            return true;
        }

        return false;
    }
    public int mergeIntervals(List<int[]> intervals) {
        List<int[]> merged = new ArrayList<>();

        int[] curInterval = intervals.get(0);

        for(int i=1; i<intervals.size(); i++) {
            int[] nextInterval = intervals.get(i);

            if(curInterval[1] > nextInterval[0]) {
                curInterval[1] = Math.max(curInterval[1], nextInterval[1]);
            } else {
                merged.add(curInterval);
                curInterval = nextInterval;
            }
        }

        merged.add(curInterval);
        return merged.size();
    }
}