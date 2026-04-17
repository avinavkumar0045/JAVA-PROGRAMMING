//So basically we have to find the Longest Increasing subsequences, SO first we sorted the given array ans then stored it in the set , so all r unique
// Now its just a questiom in qn.
import java.util.*;
public class twoLongestIncreasingSubsequence {
    public static int LCSTabulation(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int [][]  dp = new int[n+1][m+1];
        
        for(int i =0; i<n+1 ; i++){
            for(int j =0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if( arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;

                }else{
                   int  ans1 = dp[i-1][j];
                   int  ans2 = dp[i][j-1];
                   dp[i][j] = Math.max(ans1,ans2);

                }
            }
        }  
        return dp[n][m] ;     
    }
    public static int LIS(int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()]; // soritng unique elements
        int i =0;
        for(int num : set) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2); // sorted in ascending order 
        return LCSTabulation(arr1 , arr2); // now its a question of LCS for two array 
    }
    public static void main(String[] args) {
        int arr[] ={50,3,10,7,40,80};
        System.out.println(LIS(arr));
    }
    
}
