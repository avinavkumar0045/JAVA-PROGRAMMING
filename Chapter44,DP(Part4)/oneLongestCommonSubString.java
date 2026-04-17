public class oneLongestCommonSubString { // if same them +1, lakin agar same nahi hua to restart with 0(cause substrign need to be contiguous)
    //O (N*M);
    public static int LCSTabulation(String str1 , String str2, int n , int m){ 

        int [][]  dp = new int[n+1][m+1];
        int ans = 0;
        
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
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans , dp[i][j]); // we should return the maximum of both, cause longest substring can also be within the string 
                }else{
                    dp[i][j] = 0;
                }
            }
        }  
        return ans ;     
    }

    public static void main(String[] args) { 
        String str1 = "abcde"; //size n
        String str2 = "abgce"; //size m
        int n = str1.length();
        int m = str2.length();  //ans = 2 "AB";

        System.out.println(LCSTabulation(str1,str2,n,m)); // tabulation 
    }   
}
