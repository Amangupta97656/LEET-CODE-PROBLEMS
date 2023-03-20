class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        int nr[] = new int[n];
        int nl[] = new int[n];

        Stack<Integer> s = new Stack<>();
        // Right
        for(int i = n-1; i>=0; i--){
            while(!s.empty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty()){
                nr[i] = n;
            }
            else{
                nr[i] = s.peek();
            }
            s.push(i);
        }
        // Left
        s = new Stack<>();
        for(int i = 0; i<heights.length; i++){
            while(!s.empty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.empty()){
                nl[i] = -1;
            }
            else{
                nl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0; i<n; i++){
            int hi = heights[i];
            int width = nr[i]-nl[i]-1;
            int curr = hi * width;
            max = Math.max(curr, max);
        }
        return max;
    }
}