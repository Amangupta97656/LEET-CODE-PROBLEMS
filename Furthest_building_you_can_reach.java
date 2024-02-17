class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int prefix = 0;
        int remBricks = bricks;
        int remLad = ladders;
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] <= heights[i-1]) {
                continue;
            }
            int diff = heights[i] - heights[i-1];
            if (remLad > 0) {
                // We still have ladders, so let's use them
                pq.add(diff);
                remLad--;
            } else if (!pq.isEmpty() && pq.peek() < diff) {
                // current difference in heights is more than the least one we previously fulfilled with a ladder
                // so it makes sense to use ladder there instead, and bricks in that least height case
                pq.add(diff);
                remBricks -= pq.poll();                
            } else {
                // no ladders, and height is less than all where ladders are used
                // so we use bricks
                remBricks -= diff;
            }
            if (remBricks < 0) {
                return i - 1;
            }
        }
        return heights.length - 1;
    }
}