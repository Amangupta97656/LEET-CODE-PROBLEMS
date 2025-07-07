class Solution {
    private int findUP(int day, int[] parent) {
        // path compression
        if(parent[day] != day) {
            parent[day] = findUP(parent[day],parent);
        }
        return parent[day];
    }
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b) -> a[1] - b[1]);
        int n = events.length;
        int lastDay = events[n-1][1];
        int[] parent = new int[lastDay+2];
        for(int i=0;i<=lastDay+1;i++) parent[i] = i;
        int cnt = 0;
        for(int[] event : events) {
            int day = findUP(event[0],parent);
            if(day <= event[1]) {
                cnt++;
                parent[day] = findUP(day+1,parent);
            }
        }
        return cnt;
    }
}