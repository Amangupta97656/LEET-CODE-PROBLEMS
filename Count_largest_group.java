class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxSize=0;
        for(int i=1;i<=n;i++){
            int sum = calcSumOfDigit(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            maxSize = Math.max(maxSize,map.get(sum));
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxSize){
                count++;
            }
        }
        return count;
    }

    private int calcSumOfDigit(int s){
        int sum=0;
        while(s!=0){
            sum+=(s%10);
            s/=10;
        }
        return sum;
    }
}