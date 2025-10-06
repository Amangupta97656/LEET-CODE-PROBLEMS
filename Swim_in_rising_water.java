class Solution {
    static boolean[][] visited;
    public int swimInWater(int[][] grid) {
        int n=grid.length, max=0, min=Math.max(grid[0][0],grid[n-1][n-1]);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                max=Math.max(grid[i][j],max);
            }
        }
        visited=new boolean[n][n];
        while(min!=max){
            int mid=(min+max)/2;
            for(int i=0;i<n;i++){
                Arrays.fill(visited[i],false);
            }
            boolean check=isPossible(mid, grid,0,0,visited);
            if(check==true) max=mid;
            else min=mid+1;
        }
        return max;
    }
    static boolean isPossible(int t, int[][] grid, int i, int j, boolean[][] visited){
        visited[i][j]=true;
        int n=grid.length;
        if(i==n-1&&j==n-1) return true;
        boolean a=false,b=false,c=false,d=false;
        
            if(i+1<n&&grid[i+1][j]<=t&&visited[i+1][j]==false){
                a=isPossible(t, grid, i+1,j,visited);
                if(a==true) return true;
            }
            if(i-1>=0&&grid[i-1][j]<=t&&visited[i-1][j]==false){
                b=isPossible(t, grid, i-1,j,visited);
                if(b==true) return true;
            }
            if(j+1<n&&grid[i][j+1]<=t&&visited[i][j+1]==false){
                c=isPossible(t, grid, i,j+1,visited);
                if(c==true) return true;
            }
            if(j-1>=0&&grid[i][j-1]<=t&&visited[i][j-1]==false){
                d=isPossible(t, grid, i,j-1,visited);
                if(d==true) return true;
            }
        return false;
    }
}