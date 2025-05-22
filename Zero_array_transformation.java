class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((x,y) -> Integer.compare(y,x));
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int j=0;
        int usedCnt=0;

        Arrays.sort(queries, (x,y) -> Integer.compare(x[0],y[0]));

        for (int i=0;i<n;i++) {
            while (j<m && queries[j][0]==i) {
                maxHeap.add(queries[j][1]);
                j++;
            }

            nums[i]-=minHeap.size();

            while (nums[i]>0 && !maxHeap.isEmpty() && maxHeap.peek()>=i) {
                int ending=maxHeap.poll();
                minHeap.add(ending);
                usedCnt++;
                nums[i]--;
            }

            if (nums[i]>0)
                return -1;

            while (!minHeap.isEmpty() && minHeap.peek()<=i)
                minHeap.poll();
        }

        return m-usedCnt;
    }
}