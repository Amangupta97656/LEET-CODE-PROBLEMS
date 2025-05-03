class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int topVal = tops[0]; // Candidate from top row
        int bottomVal = bottoms[0]; // Candidate from bottom row

        for (int candidate : new int[]{topVal, bottomVal}) {
            int topSwap = 0, bottomSwap = 0;
            boolean isPossible = true;

            for (int i = 0; i < tops.length; i++) {
                // If candidate not in either top or bottom, this candidate fails
                if (tops[i] != candidate && bottoms[i] != candidate) {
                    isPossible = false;
                    break;
                }

                // Count how many swaps needed in top
                if (tops[i] != candidate) topSwap++;

                // Count how many swaps needed in bottom
                if (bottoms[i] != candidate) bottomSwap++;
            }

            if (isPossible) {
                return Math.min(topSwap, bottomSwap); // Return min of top or bottom swaps
            }
        }

        return -1; // No possible candidate
    }
}