
import java.util.Arrays;

// No of valid Parenthesis combination possible , when N is given {e.g : When N = 2 --> ()() , (())  ans  = 2}
public class OpeningAndClosingBracets {

    public static int GenerateParenthesis(int[][] dp ,int open , int total , int n){
        if( total == 2*n){ // no of opening and no of closing 
            return 1;
        }
        if(dp[open][total] != -1 ){
            return dp[open][total];
        }
        int ans = 0;
        // sirf 2 cases , when open <= n & when 
        if( open < n){ // when open < n , then both open and closing ko badhao
           ans +=  GenerateParenthesis(dp ,open+1, total+1, n);
        }
        if((total-open) < open){ //  closing < opening , nice trick na ( total +1)
            ans +=   GenerateParenthesis(dp ,open, total+1, n);         
        }
        dp[open][total] = ans;
        return dp[open][total];
    }
    public static void main(String[] args) {
        int n  = 3;
        int dp[][] = new int[n+1][2*n+1];

        for(int i =0 ;i<n+1 ;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println( GenerateParenthesis(dp,0, 0, n) ); // initally opening and closing = 0       
    }  
}
