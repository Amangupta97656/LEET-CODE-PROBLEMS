class Solution {

    public boolean canAssign(long mid, int[] ranks, int k){
        int count = 0;
        for(int val : ranks){
            count += Math.sqrt(mid / val); //r*k*k = total time
                                            //then k = sqrt(time / r);
        }
        return count >= k;
    } 

    public long repairCars(int[] ranks, int cars) {
        
        long low = 1;
        long high = Arrays.stream(ranks).min().getAsInt() * (long) cars * cars;
        long ans = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;
            if(canAssign(mid, ranks, cars)){
                high = mid - 1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}