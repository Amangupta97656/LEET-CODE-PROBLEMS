class Solution {
    private int noOfNodes(int u,boolean[]vis,int val,List<List<Integer>>adj,int p){
        vis[u]=true;
        int ans=0;
        if(val==p){
            ans++;
        }
        for(int v:adj.get(u)){
            if(!vis[v]){
                ans+=noOfNodes(v,vis,(val+1)%2,adj,p);
            }
        }
        return ans;
    }
    private void dfs(int u,boolean[]vis,List<List<Integer>>adj,int p,int evenNodes,int oddNodes,int[]ans){
        vis[u]=true;
        if(p==0){
            ans[u]=evenNodes;
        }else{
            ans[u]=oddNodes;
        }
        for(int v:adj.get(u)){
            if(!vis[v]){
                dfs(v,vis,adj,(p+1)%2,evenNodes,oddNodes,ans);
            }
        }
    }
    private int[] pNodes(int n,int[][]edges,int p){
        int[]ans=new int[n];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int src=0,totalNodes=0;
        for(int i=0;i<n;i++){
            if(adj.get(i).size()>0){
                src=i;
                totalNodes++;
            }
        }
        boolean[]vis2=new boolean[n];
        int pFromSrc=noOfNodes(src,vis2,0,adj,p);
        boolean[]vis=new boolean[n];
        dfs(src,vis,adj,p,pFromSrc,totalNodes-pFromSrc,ans);
        return ans;
    }
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n1=0,n2=0;
        for(int[]edge:edges1){
            n1=Math.max(n1,1+Math.max(edge[0],edge[1]));
        }
        for(int[]edge:edges2){
            n2=Math.max(n2,1+Math.max(edge[0],edge[1]));
        }
        int[]arr1=pNodes(n1,edges1,0);
        int[]arr2=pNodes(n2,edges2,1);
        int[]ans=new int[n1];
        int max2=0;
        for(int i=0;i<n2;i++){
            max2=Math.max(max2,arr2[i]);
        }
        for(int i=0;i<n1;i++){
            arr1[i]+=max2;
        }
        return arr1;

        
    }
}