class Solution {
    public int minimumArea(int[][] grid) {
        int u=Integer.MAX_VALUE;
        int l=Integer.MAX_VALUE;
        int r=0;
        int b=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                u=Math.min(u,i);
                b=Math.max(b,i);
                r=Math.max(j,r);
                l=Math.min(j,l);
            }
        }
      }
      return (b-u+1)*(r-l+1);  
    }
}