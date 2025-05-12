class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int dig[]=new int[10];
        List<Integer> list=new ArrayList<>();
        for(int num:digits){
            dig[num]++;
        }
        for(int i=1;i<=9;i++){
            if(dig[i]==0) continue;
            dig[i]--;
            for(int j=0;j<=9;j++){
                 if(dig[j]==0) continue;
                 dig[j]--;
                 for(int k=0;k<=8;k+=2){
                     if(dig[k]==0) continue;
                     list.add(i*100 +j*10 + k);
                 }
                 dig[j]++;

            }
            dig[i]++;
        } 
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
           res[i]=list.get(i);
        }
        return res;
    }
}