//Cutti

public class twoRodCutting {
    public static int RodCutting(int val[] , int wt[] , int W){ //copied the unbounded  Unbounded KnapSack 
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
                    // 'j' is the length to fill at the moment right , to agar nahi bhara hai to isse filhaal wale se bharo
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit , excProfit ); //valid + exclude 
                }else{ // invalid 
                    int excProfit = dp[i-1][j];// invalid + exclude 
                dp[i][j] = excProfit;
                }
            }
        }
      //  Print(dp); // dekhne ke liye ki kya values aayi hai 
        return dp[n][W];     
    }
    public static void main(String[] args) {
        int price[] = {1,5,8,9,10,17,17,20};
        int length[] ={1,2,3,4,5,6,7,8};
        int rodLen = 8;

        System.out.println(RodCutting(price , length , rodLen));
        
    }
    
}
