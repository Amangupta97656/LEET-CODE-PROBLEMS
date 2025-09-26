class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int i=n-1;i>=2;i--)
        {
            int left=0;
            int right=i-1;
            while(left<right)
            {
                if(nums[right]+nums[left]>nums[i])
                {
                    count=count+(right-left);
                    right--;
                }
                else
                {
                    left++;
                }

            }

        }
        return count;
    }
}