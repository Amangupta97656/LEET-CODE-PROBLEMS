import java.util.*;

class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length, n = grid[0].length;
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        // Sorting queries with index to maintain order
        int[][] sortedQueries = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[queries.length];
        boolean[][] visited = new boolean[m][n];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{grid[0][0], 0, 0});  // [value, row, col]
        visited[0][0] = true;

        int count = 0;
        int lastValue = 0;

        for (int[] query : sortedQueries) {
            int qVal = query[0], idx = query[1];

            // Expand BFS while the top element is smaller than query value
            while (!minHeap.isEmpty() && minHeap.peek()[0] < qVal) {
                int[] cell = minHeap.poll();
                lastValue = cell[0];
                count++;

                for (int[] dir : directions) {
                    int newRow = cell[1] + dir[0];
                    int newCol = cell[2] + dir[1];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                        visited[newRow][newCol] = true;
                        minHeap.offer(new int[]{grid[newRow][newCol], newRow, newCol});
                    }
                }
            }

            result[idx] = count;
        }

        return result;
    }

    // Example Usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {{1, 2, 4}, {3, 4, 3}, {2, 1, 2}};
        int[] queries = {2, 3, 4};

        System.out.println(Arrays.toString(sol.maxPoints(grid, queries)));
    }
}