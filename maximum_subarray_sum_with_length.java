class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        long [] result = new long [nums.length];

        long currentSum = 0;

        long resultSum = Long.MIN_VALUE;

        for(int i = 0;i<k;i++) {

            currentSum+=((long)nums[i]);
        }

        result[k-1] = currentSum;
        resultSum = currentSum;

        for(int i = k;i<nums.length;i++) {

            currentSum+=((long)nums[i]);
            currentSum-=((long)nums[i-k]);
            result[i] = Math.max(currentSum+result[i-k], currentSum);

            resultSum = Math.max(resultSum, result[i]);

        }
        return resultSum;


        
    }
}