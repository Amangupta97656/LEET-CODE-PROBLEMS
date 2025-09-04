class Solution {
    public int findClosest(int x, int y, int z) {
        int defx;
        int defy;
        if(x>=z){
           defx=x-z;
        }
        else{
            defx=z-x;
        }
         if(y>=z){
           defy=y-z;
        }
        else{
            defy=z-y;
        }
        if(defx==defy){
            return 0;
        }
        else if(defx>defy){
            return 2;
        }
        else{
            return 1;
        }
    }
}