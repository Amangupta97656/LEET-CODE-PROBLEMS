class Solution {
    public int findNonMinOrMax(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp =  nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    
                }
            }
        }
        if(nums.length <=2){
            return -1;
        }
        return nums[1];
    }
}