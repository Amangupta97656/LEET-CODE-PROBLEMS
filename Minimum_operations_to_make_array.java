import java.util.*;

public class Solution {

    public static int minOperations(int[] nums, int k) {
        for (int num : nums) {
            if (num < k) return -1;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > k) {
                set.add(num);  // only care about numbers greater than k
            }
        }

        if (set.isEmpty()) {
            // All elements are already k
            boolean allEqual = true;
            for (int num : nums) {
                if (num != k) {
                    allEqual = false;
                    break;
                }
            }
            return allEqual ? 0 : -1;
        }

        // Count how many distinct levels > k
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted, Collections.reverseOrder());

        return sorted.size();
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 5, 4, 5};
        int k1 = 2;
        System.out.println(minOperations(nums1, k1)); // Output: 2

        int[] nums2 = {2, 1, 2};
        int k2 = 2;
        System.out.println(minOperations(nums2, k2)); // Output: -1

        int[] nums3 = {9, 7, 5, 3};
        int k3 = 1;
        System.out.println(minOperations(nums3, k3)); // Output: 4
    }
}