class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> nm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            nm.put(nums[i], nm.getOrDefault(nums[i], 0)+ 1);
        }

        for(Map.Entry<Integer, Integer> entry : nm.entrySet()){
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }

        return true;
    }
}