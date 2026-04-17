
public class oneFibonnachi {
    public static int fib(int n , int[] fibo){     
        if( n ==1 || n == 0){
            return n;
        }
        if( fibo[n] != 0){ // fib[n] is already calculated  
             return fibo[n];
        }
        fibo[n] = fib(n-1,fibo) + fib(n-2 ,fibo);
        return fibo[n];
    }
    public static int fibTabulation(int n){ // tabulation
        int dp[] = new int[n+1]; // try hash map , add the "value" of previous 3 
        dp[0] = 0;
        dp[1] = 1;
        for(int i =2; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] ;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int fibo[] = new int[n+1];
        System.out.println(fib(n, fibo));
        System.out.println(fibTabulation(n));
    }
    
}
