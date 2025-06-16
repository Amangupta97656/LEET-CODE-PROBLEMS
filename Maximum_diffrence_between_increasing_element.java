class Solution {
    public int maximumDifference(int[] nums) 
    {
        int diff = -1;
        
        int minElement = nums[0];
        
        int n = nums.length;
        
        for(int j=1;j<n;j++)
        {
        	if(nums[j]>minElement)
        	{
                diff = Math.max(diff, nums[j]-minElement);
        	}
        	
        	else
        	{
        		minElement = nums[j];
        	}
        }
        
        return diff;        
    }
}