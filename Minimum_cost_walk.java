class Solution {
    int[] parent;

    public int find (int x){
        if(parent[x] == -1) return x;
        return parent[x] = find(parent[x]); // path compression , pruning. 
    }
    public void union(int a, int b){
        int pa = find(a);
        int pb = find(b);
        if(pa != pb){
            parent[pb] = pa;
        }
    }
    // O(E + M) , m number of qureis. 
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        // dsu
        parent = new int[n];
        Arrays.fill(parent, -1);

        for(int[] edge : edges){
            union(edge[0], edge[1]);
        }

        // parent -> cost ( & of all weights in that connected component ). 
        int[] componentCost = new int[n];
        Arrays.fill(componentCost, Integer.MAX_VALUE);

        for(int[] edge : edges){
            // u -> v
            int parent = find(edge[0]);
            componentCost[parent] &= edge[2];
        }      

        // [start, end]  pstart, pend & 
        int[] ans = new int[query.length]; int i=0;
        for(int[] q: query){
            int ps = find(q[0]);
            int pe = find(q[1]);
            if(ps != pe) 
                ans[i] = -1;
            else{
                ans[i] = componentCost[ps];
            }
            i++;        
        }
        return ans;
    }
}
