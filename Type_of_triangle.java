class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1] <= nums[2])return "none";
        
        Set<Integer>st = new HashSet();
        for(int num : nums)st.add(num);

        if(st.size() == 1)return "equilateral";
        else if(st.size() == 2)return "isosceles";

        return "scalene";
    }
}