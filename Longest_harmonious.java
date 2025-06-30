class Solution {
  public int findLHS(int[] nums) {
    int result = 0;
    Map<Integer, Integer> freqMap = new HashMap<>();

    for (int value : nums) {
      freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
    }

    for (int key : freqMap.keySet()) {
      if (freqMap.containsKey(key + 1)) {
        result = Math.max(result, freqMap.get(key) + freqMap.get(key + 1));
      }
    }

    return result;
  }
}
