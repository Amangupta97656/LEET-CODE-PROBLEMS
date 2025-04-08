class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int count=0;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            if(set.contains(nums[i])){  // start from last and find for duplicate
                int remove=n-count; // using last n unique elemnts find count of
                                    // elements needed to remove
                if(remove % 3 == 0){
                    ans=remove/3;
                }
                else{
                    ans=(remove/3)+1;
                }
                return ans;
            }
            else{
                set.add(nums[i]);
                count++;
            }
        }
        return ans;
        
    }
}