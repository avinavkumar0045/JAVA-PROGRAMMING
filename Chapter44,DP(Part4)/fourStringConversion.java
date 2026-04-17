//The idea for string conversion is , if we get the length of the LCS string then we can str2.len - LCS.length to get the value ;
public class fourStringConversion { //DOUBT HAI 
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
        String str1 = "abcdeff"; //size n
        String str2 = "abcde"; //size m
        int n = str1.length();
        int m = str2.length();
        int lcsLength = LCSTabulation(str1, str2 ,  n ,  m);
        System.out.println("No. of ops reqd to convert str1 to str2 is :"+ (m - lcsLength));


    }
    
}
