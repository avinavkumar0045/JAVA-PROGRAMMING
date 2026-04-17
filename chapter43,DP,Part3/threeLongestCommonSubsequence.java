public class threeLongestCommonSubsequence {//
    public static int LCS(String str1, String str2, int n, int m){
        if( n == 0|| m == 0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){ // same 
            return LCS(str1, str2 , n-1 , m-1)+1 ; // +1 cause they are same(subsequences)
            
        }else { // else
            int ans1 = LCS(str1, str2, n-1, m);
            int ans2 = LCS(str1, str2, n , m-1);
            return Math.max(ans1 , ans2);
        }
    }
    // Memoisation Code
    public static int LCS2(String str1, String str2, int n, int m, int[][] dp){
        if( n == 0|| m == 0){
            return 0;
        }
        if(dp[n][m] != -1){ // as in memoisation , we store the calculated values 
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){ // same 
            dp[n][m] = LCS2(str1, str2 , n-1 , m-1 , dp)+1 ; // updating the values of dp[][] ( if same to phele jitna same tha + 1)
            return dp[n][m];
            
        }else { // else
            int ans1 = LCS2(str1, str2, n-1, m , dp); // 1st option is to reduce the size of 1st option 
            int ans2 = LCS2(str1, str2, n , m-1 , dp); //  second option hai ki 2nd ka size jam kro
            dp[n][m] =  Math.max(ans1 , ans2);
            return dp[n][m];
        }
    }
    public static int LCSTabulation(String str1 , String str2, int n , int m){
        int [][]  dp = new int[n+1][m+1];
        
        for(int i =0; i<n+1 ; i++){
            for(int j =0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if( str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;

                }else{
                   int  ans1 = dp[i-1][j];
                   int  ans2 = dp[i][j-1];
                   dp[i][j] = Math.max(ans1,ans2);

                }
            }
        }  
        return dp[n][m] ;     
    }

    public static void main(String[] args) {
        String str1 = "abcdgh"; //size n
        String str2 = "acdghr"; //size m
        int n = str1.length();
        int m = str2.length();
        System.out.println(LCS(str1, str2, n, m));
        int dp[][] = new int[n+1][m+1] ; // n+1 , m+1 (nice)
        for(int i =0;i<n+1;i++){
            for(int j =0;j<m+1;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(LCS2(str1, str2, n, m , dp)); //memoisation
        System.out.println();
        System.out.println(LCSTabulation(str1,str2,n,m)); // tabulation
    }   
    
}
