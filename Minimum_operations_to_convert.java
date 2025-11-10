class Solution {
    public int minOperations(int[] nums) {
        int[] stack = new int[nums.length + 1];
        int top = 0, op = 0;
        for (int x : nums) {
            // Pop higher values; each pop counts one operation
            while (stack[top] > x) { --top; ++op; }
            // Avoid duplicates
            if (stack[top] != x) stack[++top] = x;
        }
        // op: completed segments
        // top: remaining active levels
        return op + top;
    }
}