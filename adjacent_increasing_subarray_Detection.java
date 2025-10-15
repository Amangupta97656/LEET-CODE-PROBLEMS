class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        
        int n = nums.size();
        if(n == 2) return 1;
        int len = 1;
        int prevLen = 0;
        int maxLen = 0;
        int k = 0;
        for(int i = 1 ; i < n ; i++){

            if(nums.get(i) > nums.get(i-1))len++;
            else{
                maxLen = Math.max(maxLen, len);
                k =Math.max(k ,Math.max(maxLen/2 , Math.min(prevLen, len)));
                prevLen = len;
                len = 1;
            }
            
        }
        k = Math.max(k , Math.max(len/2 , Math.min(prevLen, len)));
        return k;
    }
}