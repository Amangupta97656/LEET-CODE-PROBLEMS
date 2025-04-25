class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long ans = 0;
        int n = nums.size();
        int[] mod = new int[n];
        int x = 0;

        for (int i : nums) {
            mod[x++] = (i % modulo == k) ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            mod[i] += mod[i - 1];
        }

         Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  

        for (int i = 0; i < n; i++) {
            int currentMod = mod[i] % modulo;
            int target = (currentMod - k + modulo) % modulo;

            ans += map.getOrDefault(target, 0);

            
            map.put(currentMod, map.getOrDefault(currentMod, 0) + 1);
        }

        return ans;
    }
}