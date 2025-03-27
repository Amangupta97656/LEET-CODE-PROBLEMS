class Solution {
    public int minimumIndex(List<Integer> nums) {
        int count=0,dom=0,n=nums.size();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2){
                dom=entry.getKey();
                count=entry.getValue();
                break;
            }
        }
        int leftCount=0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)==dom) leftCount++;
            int leftSize=i+1;
            int rightCount=count-leftCount;
            int rightSize=n-leftSize;
            if(leftCount>leftSize/2 && rightCount>rightSize/2){
                return i;
            }
        }
        return -1;
    }
}