class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0;
        long windowSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            
            // Shrink the window if the score is too large
            while (windowSum * (right - left + 1) >= k) {
                windowSum -= nums[left];
                left++;
            }
            
            // For each valid window, add (right - left + 1) subarrays
            ans += (right - left + 1);
        }
        return ans;
    }
}