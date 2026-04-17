// The question is to find the lowest value of (2 matrix multiplication ) , VERY VERY good question
import java.util.*;
public class oneMatrixChainMultiplication {
    public static int mcm(int arr[] , int i , int j){
        if( i == j){
            return 0;
        }
        int ans = Integer.MAX_VALUE ; // ans is the min cost 
        for(int k = i; k < j ; k++){
            int cost1 = mcm(arr , i ,k); // Ai ... Ak => arr[i-1] * arr[k]
            int cost2 = mcm(arr ,k+1 ,j); // Ai+1 ... Aj => arr[k] * arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans , finalcost);
        }
        return ans ; // min cost 
    }
    // Memoisation

    public static int mcmMemo(int arr[] ,int dp[][] , int i , int j ){
        if( i == j){
            return 0;
        }
        int n = arr.length;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<j;k++){
            int cost1 = mcmMemo(arr, dp, i, k);
            int cost2 = mcmMemo(arr, dp, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans , finalcost);
        }
        return dp[i][j] = ans ; // dp i , j have to return the value
    }
    // Tabulation code , thoda dhyan se 
    public static int mcmTab(int arr[]){
        int n = arr.length;
        int[][] dp = new int[n][n];

        // initialization 
        for(int i = 0;i<n;i++){
           dp[i][i] = 0;  // initializing all the diagonals to 0 , as the base case is when  (i == j)

        }
        // bottom up
        for(int len = 2; len < n;len++){
            for(int i =1; i<=n-len; i++){
                int j = i+len-1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for(int k =i; k<j ;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j] ,cost1+cost2+cost3);

                }
            }
        }
        print (dp); // to see the matrix formed 
        return dp[1][n-1] ; // cause we are going diagonally , and we have to find the same grid posn answer
    }
    public static void print(int dp[][]){
        for(int i =0 ;i<dp.length;i++){
            for(int j =0;j<dp[0].length ;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3}; // 5 , so 4 matrices
        int n = arr.length;

        System.out.println(mcm(arr, 1,n-1)); // i starts from 1 cause arr
        int dp[][] = new int[n][n]; // only n * n cause only 4 matrices 
        
        for(int i = 0;i<n ;i++){
           Arrays.fill(dp[i] , -1);
        }
        
       System.out.println( mcmMemo(arr, dp, 1, n-1) ); 
       // tabulation
         System.out.println(mcmTab(arr));
        
    }
    
}
