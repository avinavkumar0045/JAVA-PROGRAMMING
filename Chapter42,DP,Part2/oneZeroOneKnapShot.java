public class oneZeroOneKnapShot { // select the items so that the price of the item's in the bag is maximum
    // O( 2 ^n)
    public static int knapSack(int val[] ,int wt[] , int W, int n ){ // n refers to item number 
        if( W  == 0 || n == 0 ){
            return 0;
        }
        if ( wt[n-1] <= W ){ //VALID, n-1 so we get to the correct index 
            // include
          int ans1=  val[n-1] +  knapSack(val,wt ,W-wt[n-1] , n-1); // to yeha pe usse store kara ke , aab ek aage badh gai
          // exclude 
          int ans2 = knapSack(val,wt ,W , n-1);//to check for alternates

          return Math.max(ans1 , ans2);                                                                                                                                                                                                                                                                   
        }
        else{ // exclude is the only option 
            return  knapSack(val,wt ,W , n-1);
        }
    }
    // Memoisation   // O( n* W)
    public static int knapSack(int val[] ,int wt[] , int W, int n, int[][] dp ){ // n refers to item number 
        if( W  == 0 || n == 0 ){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if ( wt[n-1] <= W ){ //VALID, n-1 so we get to the correct index 
            // include
          int ans1=  val[n-1] +  knapSack( val,wt ,W-wt[n-1] , n-1, dp); // to yeha pe usse store kara ke , aab ek aage badh gai
          // exclude 
          int ans2 = knapSack(val,wt ,W , n-1,dp);
          dp[n][W] =  Math.max(ans1 , ans2);
          return dp[n][W];
        }
        else{ // exclude is the only option 
            dp[n][W] = knapSack(val,wt ,W , n-1, dp);
            return dp[n][W];
        }
    }

    // KnapSack Through tabulation
    public static int knapSackTab(int val[] , int wt[] , int W){
        int n = val.length;
        int dp[][] = new  int[n+1][W+1] ;
        for(int i =0;i<dp.length ;i++){  // if n(items) = 0; then the answer will be zero 
            dp[i][0] = 0;
        }
        for(int i =0;i<dp[0].length ;i++){  // if W(weight) = 0; then the answer will be zero 
           dp[0][i] = 0;
        }
        for( int i =1; i<n+1;i++){ // start from one, as 0th ki value has been fixed 
            for(int j =1;j<W+1;j++){
                int v = val[i-1]; // ith item value 
                int w = wt[i-1];  // ith item weight   

                if( w <= j){ // valid
                    int incProfit = (v + dp[i-1][j-w] ); // means curr + baakispace fill with  phele wale element 
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
        int W = 7; // Here W refers to max weight of the bag 
        System.out.println( knapSack(val, wt, W, val.length)); // normal recursion
        // for memoisation
        int dp[][] = new int[val.length+1][W+1];
        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knapSack(val , wt , W , val.length,dp)); // recursion
        System.out.println(knapSackTab(val, wt,W)); // Tabulation
    }  
}
