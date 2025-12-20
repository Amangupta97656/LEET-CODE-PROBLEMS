class Solution {
    public int minDeletionSize(String[] strs) {
        int result=0;
        int n=strs.length;
        int length=strs[0].length();
        int pos=0;
        for(int i=0;i<length;i++){
            boolean breakCol=false;
            while(pos<n-1){
                if(strs[pos].charAt(i)>strs[pos+1].charAt(i)){
                    result+=1;
                    breakCol=true;
                }
                if(breakCol) break;
                pos++;
            }
            pos=0;
        }
        return result;
    }
}