import java.util.*;

public class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        // create adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] path : paths) {
            int x = path[0] - 1, y = path[1] - 1;
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        int[] flowers = new int[n]; // array to store the flower types
        Arrays.fill(flowers, -1); // initialize all gardens with -1
        
        // loop over all gardens and assign a flower type to each garden
        for (int i = 0; i < n; i++) {
            // if the current garden already has a flower type assigned, skip it
            if (flowers[i] != -1) {
                continue;
            }
            
            // create a set of flower types that are used in neighboring gardens
            Set<Integer> used = new HashSet<>();
            for (int j : graph.get(i)) {
                if (flowers[j] != -1) {
                    used.add(flowers[j]);
                }
            }
            
            // assign a flower type to the current garden that is not used by neighboring gardens
            for (int f = 1; f <= 4; f++) {
                if (!used.contains(f)) {
                    flowers[i] = f;
                    break;
                }
            }
        }
        
        return flowers;
    }
}
