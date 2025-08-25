class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[] result = new int[n * m];
        int i = 0, j = 0, dir = 1;  // dir = 1 (up-right), dir = -1 (down-left)
        
        for (int k = 0; k < n * m; k++) {
            result[k] = mat[i][j];
            
            if (dir == 1) { // moving up-right
                if (j == m - 1) {  // last column reached
                    i++;
                    dir = -1;
                } else if (i == 0) {  // first row reached
                    j++;
                    dir = -1;
                } else {
                    i--;
                    j++;
                }
            } else { // dir == -1 (down-left)
                if (i == n - 1) {  // last row reached
                    j++;
                    dir = 1;
                } else if (j == 0) {  // first column reached
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}