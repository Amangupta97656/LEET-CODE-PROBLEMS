class Solution {
    public boolean hasSameDigits(String s) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
             arr[i] = s.charAt(i) - '0'; 
        }
        int j=s.length();
        while(j!=2){
            for(int i=0;i<j-1;i++){
                int x=arr[i]+arr[i+1];
                if(x>10){
                    x=x%10;
                }
                arr[i]=x;
            }
            j--;
        }
        return arr[0]==arr[1];
    }
}