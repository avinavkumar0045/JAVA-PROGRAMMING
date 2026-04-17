import java.util.Arrays;

// In this question we have to take minimum jumps ( value of jump can be max , to value at ith place ), so that we reach the last index the fastest
public class threeMinArrayJumps {
    public static int minJumps(int nums[]){
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]= 0; // cause waha se to 0 path hi honge , as it the the same place 
        
        for(int i =n-2 ;i >= 0;i-- ){
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for(int j = i+1 ;j<=i+steps  && j <n ; j++){
                if(dp[j] != -1){
                    ans = Math.min(ans , dp[j]+1);
                } 
            }
            if( ans  != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
         return dp[0];
    }

    public static void main(String[] args) {
        int arr[] ={ 2,3,1,1,4};
       System.out.println( minJumps(arr));   
    }  
}
