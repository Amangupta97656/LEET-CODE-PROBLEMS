class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
int min_val=nums[0];
int subs=1;
for(int i=0;i<n;i++){
    if(nums[i]-min_val>k){
     min_val=nums[i];
     subs++;
    }
    
}
return subs;
    }
}