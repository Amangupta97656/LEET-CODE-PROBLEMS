class Solution {
    public boolean validColouring(int[][] gr, int[] colour, int node, int col) {
        if (colour[node] != 0)
            return colour[node] == col;

        colour[node] = col;
        for (int ne : gr[node]) {
            if (!validColouring(gr, colour, ne, -col))
                return false;
        }

        return true;
    }

    public boolean isBipartite(int[][] gr) {
        int n = gr.length;
        int[] colour = new int[n];

        for (int node = 0; node < n; node++) {
            if (colour[node] == 0 && !validColouring(gr, colour, node, 1))
                return false;
        }

        return true;
    }
}