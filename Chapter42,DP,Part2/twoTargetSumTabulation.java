
public class twoTargetSumTabulation { 
    public static boolean TargetSum(int arr[] , int sum){ // O( sum * n)
        int n =arr.length; 
        boolean dp[][] = new boolean[arr.length+1][sum+1];
        // i-> items , j-> target sum
        for(int i=0;i<dp.length;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<dp[0].length;i++){
            dp[0][i] = false; // ye to false hi rahe ga 
        }
        for(int i=1;i<n+1;i++){ //s tart from1 
            for( int j =1;j<sum+1;j++){
               int v = arr[i-1];
               //Include
               if( v <= j && dp[i-1][j-v] == true){ // if true , include
                dp[i][j] =true;
                //exclude 
                }else if  (dp[i-1][j] == true){
                    dp[i][j] =true;
                }
            }
        }
        Print(dp);
        return dp[n][sum];
    }
    public static void Print(boolean dp[][]){
        for(int i =0; i<dp.length ; i++){
            for(int j =0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum =10;
        System.out.println(TargetSum(arr, sum));
    }
    
}
