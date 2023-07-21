package Apnacollege.Dp;

import java.util.Arrays;

public class Knapsack{

    public static int knapsack(int val[], int wt[], int W, int n){
        if(W == 0 ||n ==0){
            return 0;
        }
        if(wt[n-1]<= W){
             int ans1 = val[n-1] + knapsack(val,wt,W-wt[n-1],n-1);
               int ans2 = val[n-1] + knapsack(val,wt,W,n-1); 
               int a = W-wt[n-1];
               System.out.println(val[n-1]+" "+a);
               return Math.max(ans1,ans2);
        }
        else{
             return  knapsack(val,wt,W,n-1);
        }
        
    }

    public static int knapsack(int val[],int wt[],int n,int w,int dp[][]){
         
        if(n==0 || w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        if(wt[n-1]<=w){
            //include
            int ans1 = val[n-1] + knapsack(val, wt, n-1, w-wt[n-1], dp);
            //exclude
            int ans2 = knapsack(val, wt, n-1, w, dp);
            dp[n][w] = Math.max(ans1, ans2);

            return dp[n][w];
        }else{
            dp[n][w]=knapsack(val, wt, n-1, w, dp);
            return dp[n][w];
        }
    }

    public static int knapsackOpt(int val[], int wt[], int W, int n,int dp[][] ){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
            int ans1 = val[n-1] +knapsackOpt(val, wt, W-wt[n-1], n-1, dp);
            int ans2 = knapsackOpt(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W];

        }
        else{
          dp[n][W] =   knapsackOpt(val, wt, W, n-1, dp);
          return dp[n][W];

        }
    }
// DP - tabulation
    public static int knapsackTab(int val[], int wt[], int W, int dp[][]){ // no need of the n because istade of the n we are using loop i & j
     
       // initialization of row as 0
       for(int i=0;i<dp.length;i++){
        dp[i][0]=0;
    }
    // initialization of col as 0
    for(int j=0;j<dp[0].length;j++){
        dp[0][j]=0;
    }

        for(int i =1; i<dp.length;i++){ 
        for(int j =1; j<dp[0].length;j++){
            
            if(wt[i-1] <= j){
                int ans1 = val[i-1] + dp[i][j- wt[i-1]];
                int ans2 = dp[i-1][j]; // dp[i-1] becase array size of the wt=[2,3,4] starts form 0
                // but the weight size starts from the 1  
                // j is the like capacity of the wt were we can store
                dp[i][j] = Math.max(ans1, ans2); // we started  dp from the 0 but we put the  dp[0][i] = && dp[j][0] = 0 
                // it mean that dp is an array were we store the val of the complete W - wt[i] values so we need not to calculate it again
                // storing the the values in dp array , so we can use it again for the larger problem statement

            }
            else{
                dp[i][j] =  dp[i-1][j];
            }
        }
     }

     for (int index = 0; index < dp.length; index++) {
            System.out.println(Arrays.toString(dp[index]));
        }
        System.out.println();
        return dp[val.length][W];
    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
          int dp2[][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
                // dp2[i][j]=-1;
            }
        }

    // System.out.println(   knapsack(val, wt,W , val.length));
    System.out.println(knapsackOpt(val, wt, W,  val.length,dp));
   System.out.println(knapsackTab( val,wt,W,dp2));
    }
}
