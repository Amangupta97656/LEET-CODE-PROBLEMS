class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        
        int[] diff=new int[nums.length+1];
        int pos=0,sum=0;
        for(int i=0;i<nums.length;i++){
            while(sum+diff[i]<nums[i]){
                if(pos==queries.length) return -1; 
                
                int st=queries[pos][0];
                int end=queries[pos][1];
                int val=queries[pos][2];

                if(end<i) {
                    pos++;
                    continue;
                }
                diff[Math.max(i,st)]+=val;
                diff[end+1]-=val;
                
                pos++;
            }
            sum+=diff[i];
        }
        return pos;
    }
}