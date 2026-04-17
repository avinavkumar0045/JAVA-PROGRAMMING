

public class threeUnboundedKnapSack {
      // KnapSack Through tabulation
      public static int UnBoundedknapSackTab(int val[] , int wt[] , int W){
        int n = val.length;
       int dp[][] = new  int[n+1][W+1] ;
       for(int i =0;i<dp.length ;i++){  // if n(items) = 0; then the answer will be zero 
            dp[i][0] = 0;
       }
       for(int i =0;i<dp[0].length ;i++){  // if W(weight) = 0; then the answer will be zero 
           dp[0][i] = 0;
       }
       for( int i =1; i<n+1;i++){ // start frim one, as 0th ki value has been fixed
            for(int j =1;j<W+1;j++){
                int v = val[i-1]; // ith item value 
                int w = wt[i-1];  // ith item weight 

                if( w <= j){ // valid
                    int incProfit = (v + dp[i][j-w] ); //means curr + baaki space bhi issi se bharo ( dp[i-1][j-w]) ke jagah ( dp[i][j-w])  
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit , excProfit ); //valid + exclude 
                }else{ // invalid 
                    int excProfit = dp[i-1][j];// invalid + exclude 
                dp[i][j] = excProfit;
                }
            }
        }
        Print(dp); // dekhne ke liye ki kya values aayi hai 
        return dp[n][W];     
    }

    public static void Print(int dp[][]){
        for(int i =0; i<dp.length ; i++){
            for(int j =0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int val[] = { 15,14,10,45,30};//( val and wt )ko agar "val" ke basis pe sort kar lo to jada sahi rahe ga
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(UnBoundedknapSackTab(val, wt,W)); // Tabulation
    }
    
}
