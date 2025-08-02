class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        // Count frequency of each fruit in both baskets
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequencies in basket1
        for (int fruit : basket1) {
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);
        }
        
        // Count frequencies in basket2
        for (int fruit : basket2) {
            freq.put(fruit, freq.getOrDefault(fruit, 0) - 1);
        }
        
        // Find minimum fruit value across both baskets
        int minFruit = Integer.MAX_VALUE;
        for (int fruit : basket1) {
            minFruit = Math.min(minFruit, fruit);
        }
        for (int fruit : basket2) {
            minFruit = Math.min(minFruit, fruit);
        }
        
        // Lists to store fruits that need to be swapped
        List<Integer> toSwap = new ArrayList<>();
        
        // Check if swap is possible and collect fruits to swap
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int diff = entry.getValue();
            
            // If difference is odd, impossible to balance
            if (diff % 2 != 0) {
                return -1;
            }
            
            // Add fruits that need to be swapped
            int swapCount = Math.abs(diff) / 2;
            for (int i = 0; i < swapCount; i++) {
                toSwap.add(entry.getKey());
            }
        }
        

        Collections.sort(toSwap);
        
        // Calculate minimum cost
        long cost = 0;
        int n = toSwap.size();
        
        // We only need to swap half of the fruits (the other half will be balanced automatically)
        for (int i = 0; i < n / 2; i++) {
            // Direct swap cost vs using minimum fruit as intermediary
            // Using min fruit as intermediary costs: 2 * minFruit
            // Direct swap costs: min(fruit from basket1, fruit from basket2)
            cost += Math.min(toSwap.get(i), 2L * minFruit);
        }
        
        return cost;
    }
}