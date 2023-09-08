class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the result as a list of lists
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        // Initialize the first row with a single element '1'
        pascalTriangle.add(new ArrayList<>());
        pascalTriangle.get(0).add(1);

        // Generate the rest of the rows
        for (int currentRow = 1; currentRow < numRows; currentRow++) {
            // Create a new row for the current level
            pascalTriangle.add(new ArrayList<>());

            // Get references to the current and previous rows
            List<Integer> currentRowList = pascalTriangle.get(currentRow);
            List<Integer> previousRowList = pascalTriangle.get(currentRow - 1);

            // The first element of each row is always '1'
            currentRowList.add(1);

            // Calculate and populate the middle elements of the row
            for (int j = 1; j < previousRowList.size(); j++) {
                int sum = previousRowList.get(j) + previousRowList.get(j - 1);
                currentRowList.add(sum);
            }

            // The last element of each row is also '1'
            currentRowList.add(1);
        }

        return pascalTriangle;
    }
}