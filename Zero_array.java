class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int diff[] = new int[nums.length+1];
        for (int j = 0; j < queries.length; j++) {
            int start = queries[j][0];
            int end = queries[j][1];
            diff[start]--;
            diff[end+1]++;
        }
    

    int curr=0;
    for(int i = 0;i<nums.length;i++)
    {
        curr += diff[i];
        if (nums[i] + curr > 0)
            return false;
    
    }return true;

}
}