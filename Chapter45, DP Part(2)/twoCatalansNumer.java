
import java.util.Arrays;


public class twoCatalansNumer {
   // Catalans Recursion
    public static int CatalansNUm(int n){ // Catalans Recursion
        if( n == 0 || n ==1 ){
            return 1;
        }
        int ans = 0;
        for(int i =0;i<n;i++){
            ans += CatalansNUm(i) * CatalansNUm(n-i-1);
        }
        return ans;
    }

    // Catalans Memoissartion
    public static int CatalansMemo(int n ,  int dp[] ){
        if(  n == 0 || n ==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
            
        }
        int ans = 0;
        for(int i =0;i<n;i++){
            ans += CatalansMemo(i,dp) * CatalansMemo(n-i-1 , dp);
        }
        return dp[n] = ans;
        
    }

    // Tabulation
    public static int CatalansTab(int n){ // O(n*n)
        int [] dp = new int [n+1];
        dp[0] = dp[1] =1;

        for(int i =2;i<n+1;i++){ //DO DRY RUN TO UNDERSTAND
            for(int j = 0;j<i;j++){ // this is the actual loop of Catlans, above it was going from (0 to n ), here  (0 to i)
                dp[i] += dp[j] * dp[i-1-j]; // n-1-j ; here n = i;

            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n =5;
        System.out.println(CatalansNUm(n));       
        // modifications for Memoisation
        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.println(CatalansMemo(n, dp));
        System.out.println(CatalansTab(n));
    }
}
