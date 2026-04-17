
public class oneChangeCoin {

    public static int rec(int[] coins , int sum){ 
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        //initialize 
        // i-> coins;
        //j-> sum
        for(int i = 0; i<n+1;i++){ // when sum is zero , its has only one way
            dp[i][0]=1;
        }
        for(int j = 1; j<sum+1 ;j++){ // when there are 0 coins, then no wayy.
            dp[0][j]=0;
        }

        for(int i = 1;i<n+1 ;i++){ // O( n * sum)
            for(int j =1 ;j< sum+1;j++){
                if(coins[i-1] <= j){ //valid 
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]]; // se unbounded knapSack for this line, means curr + baaki Potli bhi issi se bharo
                }else{ // invalid 
                    dp[i][j] = dp[i-1][j] ;
                }

            }
        }
        return dp[n][sum] ; // ways 



    }
    public static void main(String[] args) { 
        int coins[] = { 1,2,5};
        int sum =11;
        System.out.println(rec(coins,sum));
    }
    
}
