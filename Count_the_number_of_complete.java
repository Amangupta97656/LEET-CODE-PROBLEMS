class Solution {
    int[] parent;
    
    public int countCompleteComponents(int n, int[][] edges) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        // Union edges
        for (int[] edge : edges) {
            int a = find(edge[0]);
            int b = find(edge[1]);
            parent[b] = a;
        }
        
        int[] nodeCount = new int[n];
        int[] edgeCount = new int[n];
        
        // Count nodes in each component
        for (int i = 0; i < n; i++) {
            nodeCount[find(i)]++;
        }
        
        // Count edges in each component
        for (int[] edge : edges) {
            edgeCount[find(edge[0])]++;
        }
        
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            int count = nodeCount[i];
            if (count == 0) continue;
            
            int expectedEdges = count * (count - 1) / 2;
            if (expectedEdges == edgeCount[i]) {
                totalCount++;
            }
        }
        return totalCount;
    }
    
    int find(int n) {
        if (n == parent[n]) {
            return n;
        }
        return parent[n] = find(parent[n]);
    }
}