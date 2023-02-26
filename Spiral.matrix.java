class Solution {
    public List<Integer> spiralOrder(int[][] arr) 
    {	
		int n=arr.length;
        int m=arr[0].length;
        ArrayList<Integer> f=new ArrayList<>();
		boolean a=true;
		boolean b=false;
		int i=0;
		int j=0;
		int q=0;
		int p=-1;
		int r=m;
		int s=n;
		int count=0;
		while(i<n&&j<m&&count<m*n)
		{
			count++;
			
			if(a==true&&b==false)
			{
				f.add(arr[i][j]);
				j++;
				if(j==r)
				{
					j--;
					i++;
					a=false;
					r--;
				}
			}
			else if(a==false&&b==false)
			{
				f.add(arr[i][j]);
				i++;
				if(i==s)
				{
					j--;
					i--;
					b=true;
					s--;
				}
			}
			else if(b==true&&a==false)
			{
				f.add(arr[i][j]);
				//System.out.print("(i:"+i+" j:"+j+") ");
				j--;
				if(j==p)
				{
					i--;
					j++;
					a=true;
					p++;
					
				}
			}
			else if(b==true&&a==true)
			{
				f.add(arr[i][j]);
				i--;
				if(i==q)
				{
					i++;
					j++;
					b=false;
					q++;
				}
				
			}
		}
        return f;
	}
}