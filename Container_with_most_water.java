class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int res = 0;
        while(p1<p2){
            if(height[p1]<height[p2]){
                res = Math.max(res, (p2-p1)*height[p1]);
                p1++;
            }else{
                res = Math.max(res, (p2-p1)*height[p2]);
                p2--;
            }
        }
        return res;
    }
}