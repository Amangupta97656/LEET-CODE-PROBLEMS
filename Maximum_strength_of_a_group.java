import java.util.*;

class Solution {
    public long maxStrength(int[] nums) {
        int n = nums.length;
        List<Long> negs = new ArrayList<>();
        List<Long> pos = new ArrayList<>();
        for (int num : nums) {
            if (num < 0)
                negs.add((long) num);
            if (num > 0)
                pos.add((long) num);
        }
        long prod = 1;
        long x = Collections.frequency(Arrays.asList(nums), 0);
        Collections.sort(negs);
        if (negs.size() <= 1 && pos.size() == 0)
            return Arrays.stream(nums).max().getAsInt();
        if (negs.size() % 2 == 0) {
            for (long num : negs)
                prod = prod * num;
            for (long num : pos)
                prod = prod * num;
            return prod;
        } else {
            for (int i = 0; i < negs.size() - 1; ++i)
                prod = prod * negs.get(i);
            for (long num : pos)
                prod = prod * num;
            return prod;
        }
    }
}