class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        //map.put(0,1);
        int ans = 0;
        for(int x : arr){
            int need = target - x;
            
            ans += map.getOrDefault(need,0);
            
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return ans;
        
    }
}