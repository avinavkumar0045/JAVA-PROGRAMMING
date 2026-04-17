// Question is to match the given string with the given pattern  '*' and '?'

public class oneWildCardMathching { // 💫💫🌟🌟🌟💫🩷 GOOD QUESTION , respect it 

    public static boolean isMatching(String s , String p){
        int n = s.length();
        int m = p.length();

        boolean[][] dp = new boolean[n+1][m+1]; // by default boolean array in java initializes with false value

        //initialize
        dp[0][0] = true;

        //pattern= " "
        for(int i = 1; i<n+1 ;i++){
            dp[i][0] = false;
        }
        // s = " "
        for(int j =1; j <m+1 ;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        // bottom up approch
        for(int i  = 1;i<n+1 ;i++){
            for(int j =1;j<m+1 ;j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                } else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j] = false;
                }

            }
        }
        print(dp ,n , m);
        return dp[n][m];
    }
    public static void print(boolean dp[][] ,int  n ,int  m){
        for(int i = 0;i<n+1;i++){
            for(int j = 0;j<m+1;j++){
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        String s = "aa"; // "baaabab";
        String p = "a" ; //"*****ba*****ab";

        System.out.println("The answer is " + isMatching(s, p));
      
    }
    
}
 