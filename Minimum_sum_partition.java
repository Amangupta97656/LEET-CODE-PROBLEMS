class Solution
{
public int minDifference(int arr[], int n) 
{ 
    // Your code goes here
    int sum=0;
    for(int i:arr) sum+=i;
    
      
     boolean data[][]=new boolean[n+1][sum+1];
  
  for(int i=0;i<=sum;i++) data[0][i]=false;
       for(int i=0;i<=n;i++) data[i][0]=true;
       
         for(int i=1;i<=n;i++){
           for(int j=1;j<=sum;j++){
               if(arr[i-1] <= j)
               {
                   data[i][j]=data[i-1][j] || data[i-1][j-arr[i-1]];
               }
               else{
                  data[i][j]=data[i-1][j];
               }
           }
       }
   
   int m=Integer.MAX_VALUE;
   
   for(int i=sum/2;i>-1;i--){
        if(data[n][i]){
           m=Math.min(m,Math.abs(2*i-sum));
       } 
   }
   return m;
} 
}