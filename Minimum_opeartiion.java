class Solution {
    public int minOperations(int[][] grid, int x) {
        int ans = 0, idx = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int arr[] = new int[rows*cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[idx++] = grid[i][j];
            }
        }
        
        Arrays.sort(arr);
        int uniValue = arr.length / 2;
        for(int i=0; i<arr.length; i++){
            int diff = Math.abs(arr[i] - arr[uniValue]);
            if(diff % x != 0) return -1;
            ans += diff/x;
        }
        return ans;
    }
}