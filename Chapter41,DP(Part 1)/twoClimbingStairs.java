
import java.util.Arrays;
//MEMOISATION FORMAT
// ways to climb ot nth stair of , a user can take only given number of times 
public class twoClimbingStairs {
    public static int Ways(int n ){
        if( n == 0 ){
            return 1;
        }
        if(n < 0){
            return 0;
        }      
        return Ways(n-1) + Ways(n-2);
    }
    //Memoisation
    public static int WaysMemoisation(int n , int[] climb){ // O(n)
        if( n == 0 ){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if( climb[n] != -1){
            return climb[n];
        }
        climb[n] =  WaysMemoisation(n-1 ,climb) +  WaysMemoisation(n-2,climb) ;
        return climb[n];
    }

    // if he can climb 1, 2, or even 3 steps at a time then 
    public static int WaysMemosisatiion2(int n , int[] climb){ // O(n)
        if( n == 0 ){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if( climb[n] != -1){
            return climb[n];
        }
        climb[n] = WaysMemosisatiion2(n-1 ,climb) + WaysMemosisatiion2(n-2,climb) + WaysMemosisatiion2(n-3,climb) ;
        return climb[n];
    }

    public static int Tabualtion(int n){ // Tabulation method 
        int dp[] = new int[n+1];
        dp[0] = 1;

        for( int i =1;i<=n;i++){
           if(i == 1 ){
              dp[i] = dp[i-1];
            }else{
            dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static int Tabualtion2(int n){ // Tabulation method 
        int dp[] = new int[n+1]; 
        dp[0] = 1;
        dp[1] = 1;

        for( int i =2;i<=n;i++){
        
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
 
    public static void main(String[] args) {
        int n = 5; // n =3-> 3 ways && n =4 -> 5 ways & n =5 -> 8 ways 
        int[] climb = new int[n+1];
        Arrays.fill(climb ,-1);
        System.out.println(Ways(n)); // normal o(2^n) way
        Arrays.fill(climb ,-1); // everytime , nahi to ans galata aa rahe hai
       System.out.println(  WaysMemoisation(n, climb)); // if he can take only 1, 2 steps at a time 
       Arrays.fill(climb ,-1);
       System.out.println(WaysMemosisatiion2(n ,climb));  // if he can take only 1, 2 ,3 steps at a time 
       System.out.println(Tabualtion2(n)); // if he can take only 1, 2 steps at a time 
    }
    
}
