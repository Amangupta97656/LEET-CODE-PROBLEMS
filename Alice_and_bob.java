class Solution {
    public long flowerGame(int n, int m) {
        return ((long)(n/2 + n%2)*(long)(m/2)) + ((long)(m/2 + m%2)*(long)(n/2));
    }
}