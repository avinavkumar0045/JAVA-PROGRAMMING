// Dito Catlan number 
// tree nodes ko counting 
public class threeCountingTree {
    public static int CountingTree(int n){
        int dp[] = new int[n+1];
        dp[0] = dp[1] =1;

        for(int i =2 ;i<n+1 ;i++){
            for(int j = 0;j<i;j++){
                int left = dp[j];
                int right = dp[i-1-j];
                dp[i] += right * left ; // left subtree Nodes(arrangement) * right subtree nodes arrangement
            }
        }
        return dp[n];     
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountingTree(n));
    }
    
}
