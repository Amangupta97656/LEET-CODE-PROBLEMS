class Solution {
    public boolean isGood(int[] nums) {
    
        int n = nums.length;
        int arrLen = n-1;
        int[] arr = new int[arrLen];
        for(int num: nums){
            int index = num-1;
            if(index > arrLen -1 || index<= -1) return false;
            arr[index]++;
        }
        if(arr[arrLen -1] != 2) return false;
        for(int i=0;i < arrLen-1; i++){
            if(arr[i]!=1) return false;
        }
        return true;
    }
}