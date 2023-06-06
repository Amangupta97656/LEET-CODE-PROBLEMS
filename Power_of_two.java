class Solution {
    public boolean isPowerOfTwo(int n) {
     if (((n<=0)) || (Integer.lowestOneBit(n) != n)) {
         return false;
         }
        else {
         return true;
        }
    }
}