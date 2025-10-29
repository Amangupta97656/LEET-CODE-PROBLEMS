class Solution {
    public int smallestNumber(int n) {
        int current = n;
        while(Integer.toBinaryString(current).contains("0")){
            current++;
        }
        return current;
    }
}