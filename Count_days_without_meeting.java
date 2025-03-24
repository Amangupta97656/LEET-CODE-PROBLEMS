class Solution {
    public int countDays(int days, int[][] meetings) {
        List<int[]> events = new ArrayList<>();
        for (int[] meeting : meetings) 
        {
            events.add(new int[]{meeting[0], 1});
            events.add(new int[]{meeting[1] + 1, -1});
        }
        events.sort(Comparator.comparingInt(a -> a[0]));
        int avl = 0;
        int actmeet = 0;
        int pre = 1;
        for (int[] event : events) 
        {
            int currDay = event[0], change = event[1];
            if (actmeet == 0) 
            {
                avl += (currDay - pre);
            }
            actmeet += change;
            pre = currDay;
        }
        if (actmeet == 0) 
        {
            avl += (days - pre + 1);
        }
        return avl;
    }
}