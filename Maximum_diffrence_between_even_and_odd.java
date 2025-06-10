class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int oddmax=Integer.MIN_VALUE;
        int evenmax=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(int i:hm.values())
        {
            if(i%2!=0)
            {
                oddmax=Math.max(i,oddmax);
            }
            else
            {
                evenmax=Math.min(i,evenmax);
            }
        }
        
        return oddmax-evenmax;
        
    }
}