package dp;

public class unboundedKnapsack {
    public static void main(String[] args) {
               
        int val[] = {1, 1};
         int wt[] = {2, 1};
         int W=3;

        int dp[][]=new int[val.length+1][W+1];
        
        for(int i=0;i<val.length+1;i++){
            dp[i][0]=0;
        }
        
        for(int i=0;i<W+1;i++){
            dp[0][i]=0;
        }
        
        
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        
        System.out.println(dp[val.length][W]);
    }
}
