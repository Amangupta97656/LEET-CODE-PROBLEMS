class Solution {
    public void checker(StringBuilder sb, int k){
        int num=Integer.parseInt(sb.toString(), 2);
        if(num<=k)
        return;
        else{
            int index=sb.indexOf("1");
            sb.deleteCharAt(index);
            checker(sb, k);
        }
    }
    public int longestSubsequence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length(); i++){
            sb.append(s.charAt(i));
            checker(sb, k);
        }
        return sb.length();
    }
}