import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> lakeLastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>(); // indices of 0s

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1; // default, will update later if needed
            } else {
                int lake = rains[i];
                if (lakeLastRain.containsKey(lake)) {
                    // Find the earliest dry day after lastRain[lake]
                    Integer dryDay = dryDays.higher(lakeLastRain.get(lake));
                    if (dryDay == null) {
                        return new int[0]; // no valid dry day -> impossible
                    }
                    ans[dryDay] = lake; // dry this lake on dryDay
                    dryDays.remove(dryDay);
                }
                lakeLastRain.put(lake, i);
                ans[i] = -1; // raining days are always -1
            }
        }
        return ans;
    }
}