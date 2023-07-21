package Apnacollege.Dp;

public class stairingSteps {

// optimized (memoization) - O(n)
 public static int countWaysOpt(int n , int[] waysCount){
 if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(waysCount[n] != 0){
return waysCount[n];
        }

        waysCount[n] =  countWays(n-1) + countWays(n-2);
        return waysCount[n];
 }


// recursion - O(2^n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    
    public static void tableForm(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i =1; i<= n;i++){
            if( i ==1){
                dp[i] = dp[i-1]+0;
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        System.out.println("DPP"+dp[n]);
    }
    public static void main(String[] args) {
        int[] waysCountArr = new int[6+1];
        System.out.println(countWays(6));
        tableForm(6);
    }
}
