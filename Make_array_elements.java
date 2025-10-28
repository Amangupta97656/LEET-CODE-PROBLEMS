class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for(int i=0; i< nums.length; i++)
        {
            total+=nums[i];
        }
        int curSum = 0;
        int result = 0;
        for(int i=0; i< nums.length; i++)
        {
            int cur = nums[i];
            curSum += cur;
            if(cur==0)
            {
                if(curSum == (total-curSum)) result += 2;
                if(Math.abs(total-(2*curSum)) == 1)result += 1;
            }

        }
        return result;
    }
}