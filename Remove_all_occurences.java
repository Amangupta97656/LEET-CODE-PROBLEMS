class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length();
        while(s.indexOf(part)!=-1){
            int index=s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+n);
        }
        return s;
    }
}