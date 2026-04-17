// Print the absolute difference between two subset of a particular array ,
// total copy to 0-1 knapsack , put elements upto sum/2 ans do it 
public class twoMininumPartition {
    public static int Partition(int arr[]){ // put in set 1, set2 will be done automatically .
        int n = arr.length;
        int sum  = 0;
        for(int i =0;i<arr.length ;i++){
            sum += arr[i];
        }
        int W = sum /2 ; // here W means weight 
        int dp[][] = new int [n+1][W+1]; 

        for(int i = 1;i<n+1; i++){
            for(int j= 1;j<W+1 ;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]] , dp[i-1][j]);
                }else {
                    dp[i][j]  = dp[i-1][j];
                }
            } 
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1 ;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        int arr[] = {3,9,7,3};
        System.out.println(Partition(arr));   
    }
}
