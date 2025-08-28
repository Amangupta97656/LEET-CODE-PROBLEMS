import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        
        // bottom-left + main diagonal
        for (int i = 0; i < n; i++) {
            sortDiagonal(grid, i, 0, true); // start from (i,0), descending
        }
        
        // top-right
        for (int j = 1; j < n; j++) {
            sortDiagonal(grid, 0, j, false); // start from (0,j), ascending
        }
        
        return grid;
    }
    
    private void sortDiagonal(int[][] grid, int row, int col, boolean descending) {
        int n = grid.length;
        int len = 0;
        int r = row, c = col;
        
        // Count length of diagonal
        while (r < n && c < n) {
            len++;
            r++;
            c++;
        }
        
        // Copy into temp array
        int[] temp = new int[len];
        r = row; c = col;
        for (int i = 0; i < len; i++) {
            temp[i] = grid[r][c];
            r++; c++;
        }
        
        // Sort
        Arrays.sort(temp);
        if (descending) {
            reverse(temp);
        }
        
        // Put back
        r = row; c = col;
        for (int i = 0; i < len; i++) {
            grid[r][c] = temp[i];
            r++; c++;
        }
    }
    
    private void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}