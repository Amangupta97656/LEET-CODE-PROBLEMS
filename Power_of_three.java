class Solution {
    public boolean check(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n%3 == 0) return check(n/3);
        return false;
    }
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        return check(n);
    }
}
