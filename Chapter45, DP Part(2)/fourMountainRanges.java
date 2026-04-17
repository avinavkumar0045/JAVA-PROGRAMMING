 // exact catlan numbers concept 
public class fourMountainRanges {
    public static int MountainRanges(int n){
        int dp[] = new int[n+1];
        dp[0] = dp[1] =1;

        for(int i =2 ;i<n+1 ;i++){
            for(int j = 0;j<i;j++){
                int inside = dp[j]; // / \ 3
                int outside = dp[i-1-j];
                dp[i] += inside * outside ; // left subtree Nodes(arrangement) * right subtree nodes arrangement
            }
        }
        return dp[n];     
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(MountainRanges(n));
    }    
}