
import java.util.Arrays;

// find minimum sum of (absolute difference) pair( Min abs. diff. is always >= 0)
public class threeMinAbsoluteDiff {
    public static void main(String[] args) { // O(n log n)
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5}; 
        int n  = A.length;
        int MinDiff = 0;

        // After observing we found that, abs. diff. is minimum when you have both the values nearer to each other.
        Arrays.sort( A);
        Arrays.sort(B);

        for(int i =0;i<n;i++){
            MinDiff += Math.abs(A[i] - B[i]);

        }
        System.out.println("The minimum absolute diff of pair :"+ MinDiff);


        
    }
    
}
