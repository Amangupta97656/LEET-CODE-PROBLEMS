class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> cnt=new LinkedHashSet<>();
        int index=0;
        for(String email:emails)
        {
            String arr[]=email.split("@");
           index=arr[0].indexOf("+");
                if(index>0)
            arr[0]=arr[0].substring(0,index);
            arr[0]=arr[0].replaceAll("\\.","");
            cnt.add(arr[0]+"@"+arr[1]);
            
        }
        return cnt.size();
    }
}