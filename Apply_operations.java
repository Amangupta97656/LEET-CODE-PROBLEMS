class PMI {
    int ps;
    int value;
    int index;

    public PMI(int ps, int value, int index) {
        this.ps = ps;
        this.value = value;
        this.index = index;
    }
}

class Solution {
    public int maximumScore(List<Integer> nums, int k) {
        int n = nums.size();
        int[] ps = new int[n];
        getPrimeScore(nums, n, ps);
        PriorityQueue<PMI> pq = new PriorityQueue<>((a, b) -> {
            if (a.value == b.value)
                return a.index - b.index;
            return b.value - a.value;
        });

        for (int i = 0; i < n; i++) {
            pq.add(new PMI(ps[i], nums.get(i), i));
        }
        int mod = 1000000007;
        long maxScore = 1;
        while (k > 0 && pq.size() > 0) {
            PMI curr = pq.poll();
            int idx = curr.index;
            int value = curr.value;
            int score = curr.ps;
            int left_idx = idx;
            int right_idx = idx;
            for (int i = idx - 1; i >= 0; i--) {
                if (ps[i] < score) {
                    left_idx = i;
                } else {
                    break;
                }
            }
            for (int i = idx + 1; i < n; i++) {
                if (ps[i] <= score) {
                    right_idx = i;
                } else {
                    break;
                }
            }
            long leftCount = idx - left_idx + 1;
            long rightCount = right_idx - idx + 1;
            long numSubarrays = leftCount * rightCount;
            
            if (numSubarrays >= k) {
                maxScore =(maxScore * fastPower(value, k, mod))%mod;
                k = 0;
            } else {
                maxScore=(maxScore*fastPower(value,numSubarrays,mod)) % mod;
                k -= numSubarrays;
            }
        }
        return (int) maxScore;
    }

    public int fastPower(int value, long power, int mod) {
        if (power == 0)
            return 1;
        int half = fastPower(value, power / 2, mod);
        int result = (int)((long)half * half % mod);
        if (power % 2 == 1) {
            result = (int)((long)result * value % mod);
        }
        return result;
    }

    public void getPrimeScore(List<Integer> nums, int n, int[] ps) {
        int max = 100001;
        int[] spf = new int[max];
        for (int i = 0; i < max; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i < max; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < max; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            int count = 0;
            while (x > 1) {
                int factor = spf[x];
                count++;
                while (x % factor == 0) {
                    x /= factor;
                }
            }
            ps[i] = count;
        }
    }
}