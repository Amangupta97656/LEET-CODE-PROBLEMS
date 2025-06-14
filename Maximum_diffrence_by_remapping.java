class Solution {
    public int minMaxDifference(int num) {
        List<Integer> maxList = new LinkedList<>();
        List<Integer> minList = new LinkedList<>();

        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            maxList.addFirst(rem);
            minList.addFirst(rem);
            temp /= 10;
        }

        // For max: replace the first digit that's not 9 with 9
        int digitToMax = -1;
        for (int i = 0; i < maxList.size(); i++) {
            if (maxList.get(i) != 9) {
                digitToMax = maxList.get(i);
                break;
            }
        }

        if (digitToMax != -1) {
            for (int i = 0; i < maxList.size(); i++) {
                if (maxList.get(i) == digitToMax) {
                    maxList.set(i, 9);
                }
            }
        }

        // For min: replace the first digit that's not 0 with 0
        int digitToMin = -1;
        for (int i = 0; i < minList.size(); i++) {
            if (minList.get(i) != 0) {
                digitToMin = minList.get(i);
                break;
            }
        }

        if (digitToMin != -1) {
            for (int i = 0; i < minList.size(); i++) {
                if (minList.get(i) == digitToMin) {
                    minList.set(i, 0);
                }
            }
        }

        // Convert lists to integers
        int maxNum = 0, minNum = 0;
        for (int i = 0; i < maxList.size(); i++) {
            maxNum = maxNum * 10 + maxList.get(i);
            minNum = minNum * 10 + minList.get(i);
        }

        return maxNum - minNum;
    }
}