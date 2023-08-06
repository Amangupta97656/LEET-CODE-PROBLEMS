class Solution {

    public int characterReplacement(String s, int k) {
        // get a character counter array
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            // increase every right character count in the array
            arr[s.charAt(right) - 'A']++;
            // find max between current max and the count of right character
            max = Math.max(max, arr[s.charAt(right) - 'A']);
            // see if ( right - left + 1 )[total sliding window length] 
            //           - max count of right character is greater than 'k'
            if (right - left + 1 - max > k) {
                // if not then reduce left count and slide right(add one to left window) 
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            // ans = ans or windowSize (whichever is greater)
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}