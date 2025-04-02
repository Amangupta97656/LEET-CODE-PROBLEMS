class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        int l=nums.length;
        long[] max = new long[l];
        max[l-1]=(long)nums[l-1];
        for(int i=l-2;i>=0;i--){
            if(nums[i]<max[i+1])max[i]=max[i+1];
            else max[i]=(long)nums[i];
        }
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l-1;j++){
                long t=(long)(nums[i]-nums[j]);
                if(t>0){
                    res=Math.max(res,(t*max[j+1]));
                } 
            }
        }
        return res;
    }
}