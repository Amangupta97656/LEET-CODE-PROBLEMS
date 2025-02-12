class Solution {
    public int digitSum(int num){
        int sum=0;
        while(num!=0){
            int rem = num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = digitSum(nums[i]);
            if(!mp.containsKey(sum)){
                mp.put(sum,nums[i]);
            }
            else{
                max = Math.max(mp.get(sum) + nums[i], max);
                if(mp.get(sum)<nums[i]){
                    mp.put(sum,nums[i]);
                }

            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}