class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
            if(Count(num)%2==0){
                even++;
            }
        }
        return even;
    }
    public int Count(int num){
        int c=0;
        for(int i=num;i>0;i=i/10){
           int dt=i%10;
            c++;
        }
        return c;
    }
}