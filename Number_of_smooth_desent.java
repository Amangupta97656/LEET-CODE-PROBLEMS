class Solution {
    public long getDescentPeriods(int[] prices) {
     long count=1,res=0;
     for(int i=1;i<prices.length;i++)
     {
      if(prices[i-1]-prices[i]==1) 
      {
        count++;
      }
      else
      {
        res+=(count*(count+1)/2);
        count=1;
      }
     }
     res+=(count*(count+1)/2);
     return res;   
    }
}