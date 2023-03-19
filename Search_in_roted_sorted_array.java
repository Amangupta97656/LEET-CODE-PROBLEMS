class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int first=0;
        int last=nums.length-1;
        while(first<=last)
        {
            int mid=(last-first)/2+first;
            if(nums[mid]==target)
            {
                return true;
            }
            else if(nums[mid]<target)
            {
                first=mid+1;
            }
            else
            {
                last=mid-1;
            }
        }
        return false;
    }
}