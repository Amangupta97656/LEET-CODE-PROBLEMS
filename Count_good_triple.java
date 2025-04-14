class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int ai = arr[i];
                    int aj = arr[j];
                    int ak = arr[k];

                    if (Math.abs(ai-aj) <= a && Math.abs(aj-ak) <= b && Math.abs(ak-ai) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}