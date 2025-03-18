class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length, left = 0, ans = 0, mask = 0;
        for (int right = 0; right < n; right++) {
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left++];
            }
            mask |= nums[right];
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}