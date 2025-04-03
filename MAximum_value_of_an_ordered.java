class Solution {
    public long maximumTripletValue(int[] nums) {
        long highest = 0; 
        long highest_diff = 0;
        long answer = 0;
        for (int num : nums) {
            answer = Math.max(answer, highest_diff * num);
            highest_diff = Math.max(highest_diff, highest - num);
            highest = Math.max(highest, num);
        }
        return answer;
    }
}