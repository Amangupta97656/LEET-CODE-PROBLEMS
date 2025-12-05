class Solution {
    public int countPartitions(int[] nums) {
        if(nums.length==0 || nums ==null) return 0;
        int total = 0;
        for(int i : nums) total += i;

        int currSum =0;
        int count =0;
        for(int i =0;i<nums.length-1;i++){
            currSum += nums[i];
            int nextSum = total - currSum;
            if(Math.abs(nextSum-currSum)%2==0) count++;
        }
        return count;
    }
}