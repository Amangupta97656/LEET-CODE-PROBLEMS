class Solution {
    int n;
    int [][] dp;
    int [][] fruits;
    //for caluclate the first childs total sum diagon way
    public int firstChild(){
        int ans=0;
        for(int i=0;i<n;i++){
            ans +=fruits[i][i];
            fruits[i][i] = 0;
            dp[i][i] = 0;
    }
    return ans;
    }
    //for calculate second childs total from right end
    public int secondChild(int i,int j){
       //for check index out of bound
        if(i<0||i>=n||j>=n||j<0){
            return 0;
        }
        //for not take last box 
         if(i==n-1&&j==n-1){
            return 0;
        }
        //for not to cross diagonal
        if(i==j||i>j){
            return 0;
        }
        //if already  we touch that not need to calculate again
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int leftCorner=fruits[i][j]+secondChild(i+1,j-1);
        int middle=fruits[i][j]+secondChild(i+1,j);
        int rightCorner=fruits[i][j]+secondChild(i+1,j+1);

        return dp[i][j]=Math.max(middle,Math.max(leftCorner,rightCorner));
    }

//for calculate total fruit by 3 child from botoom right 
    public int thirdChild(int i, int j){
        
        if(i>=n||j>=n||i<0||j<0){
            return 0;
        }
        if(i==j||j>i){
            return 0;
        }
        if(i==n-1&&j==n-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int top=fruits[i][j]+thirdChild(i-1,j+1);
        int midle=fruits[i][j]+thirdChild(i,j+1);
        int down=fruits[i][j]+thirdChild(i+1,j+1);
        return dp[i][j]=Math.max(midle,Math.max(top,down));
    }

    public int maxCollectedFruits(int[][] fruits) {
        //not intailize just give shadow function for take the parameters 
        //from class level which already intialized
      this.fruits = fruits;
       this.n = fruits.length;
       this.dp = new int[n][n];

       //make intail zero to track
        for(int[] is : dp) Arrays.fill(is,-1);
        int firstChild1=firstChild();
        int secondChild1=secondChild(0,n-1);
        int thirdChild1=thirdChild(n-1,0);
        return (firstChild1+secondChild1+thirdChild1);   
    }
}