class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int[] ar=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            int v=fruits[i];
            for(int j=0;j<n;j++){
                if(v<=baskets[j] && ar[j]==0){
                    ar[j]=1;
                    c++;
                    break;
                }
            }
        }      
        return n-c;
    }
}