class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int s = nums.length - 1;
        int[] count = new int[32];
        int[] res = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--){
            int num = nums[i];
            int idx = 0;
            while(num > 0){
                count[idx] += (num & 1);
                num >>= 1;
                idx++;
            }
            while(s > i && isP(nums[s], count)){
                s--;
            }
            res[i] = s - i + 1;
        }
        return res;
    }
    public boolean isP(int num, int[] arr){
        for(int i = 0; i < 32; i++){
            if(arr[i] == 1 && (num & (1 << i)) > 0){
                return false;
            }
        }
        
        for(int i = 0; i < 32; i++){
            arr[i] -= (num & (1 << i)) > 0 ? 1 : 0;
        }
        return true;
    }
}