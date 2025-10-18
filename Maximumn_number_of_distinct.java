class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        
        Arrays.sort(nums);
        int count = 0;
        long lastUsed = Long.MIN_VALUE; // to handle large numbers safely

        for(int num : nums){
            long low = (long) num-k;
            long high = (long) num+k;

            // We must pick a number > lastUsed
            long pick = Math.max(low , lastUsed+1);

            if(pick<= high){
                count++;
                lastUsed = pick; // update last used number
            }
        }

        return count;
    }
}]