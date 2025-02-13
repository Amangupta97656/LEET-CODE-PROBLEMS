class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int num : nums) {
            if (num < k) {
                pq.offer(num * 1L);
            }
        }

        int res = 0;
        while (pq.size() > 0) {
            if (pq.size() == 1) return res + 1;
            long small = pq.poll();
            long big = pq.poll();
            long v = 2*small + big;
            if (v < k) {
                pq.offer(v);
            }
            res++;
        }
        return res;
    }
}