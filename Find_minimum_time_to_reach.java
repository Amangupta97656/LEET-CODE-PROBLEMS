class Solution {
    int [][] directions=new int[][]{{1, 0},{-1,0},{0,1},{0,-1}};
    
    public int minTimeToReach(int[][] moveTime) {
       return dijkstra(moveTime);
        
    }

    int result[][];
    PriorityQueue<int[]> pq = new PriorityQueue<>(
    (p, q) -> {
        return   Integer.compare(p[0], q[0]); // Compare weight
       
    }
);
    public int dijkstra(int moveTime[][]){

        
        int n=moveTime.length;
        int m=moveTime[0].length;
       
       result  = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }
        result[0][0]=0;
        pq.offer(new int []{0 ,0 ,0});
        while(!pq.isEmpty()){
          int[] pair=pq.poll();
              int current=pair[0];
              int i=pair[1];
              int j=pair[2];
              if(i==n-1 && j==m-1){
                return result[n-1][m-1];
              }
             for(int dir[]:directions){
                int ix=i+dir[0];
                int jx=j+dir[1];
                if(ix>=0 && ix<n && jx>=0 && jx<m){
                    int w=moveTime[ix][jx]-current;
                    int finalTime=Math.max(result[i][j] , moveTime[ix][jx])+1;
                    if(result[ix][jx]>finalTime){
                        result[ix][jx]=finalTime;
                        pq.offer(new int[]{finalTime , ix , jx});
                    }

                }
             }
        }
        return result[n-1][m-1];
        
    }
}