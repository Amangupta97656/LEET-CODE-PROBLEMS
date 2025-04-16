class Solution {
    public long countGood(int[] nums, int k) {
        long cntPairs=0;
        long cntSubArrays=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int n=nums.length;
        for(;j<n;j++){
            cntPairs+=map.getOrDefault(nums[j], 0);
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            while(cntPairs>=k)
            {
                cntSubArrays+=n-j;
                map.put(nums[i], map.get(nums[i])-1);
                cntPairs-=map.get(nums[i]);
                i++;
            }
        }
        return cntSubArrays;
    }
}