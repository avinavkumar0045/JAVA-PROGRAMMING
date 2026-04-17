// Take a 3x3 integer matrix from the user and write a method diagonalSum(int[][]
// matrix) that returns the sum of the main diagonal.
public class WaterThree {
    public static void main(String[] args) {
        int weight = 7;
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        for(int idx =0;idx < val.length-1 ; idx++){
            for(int jdx = idx+1;jdx < val.length;jdx++){
                if(val[idx] < val[jdx]){
                    int temp = val[idx];
                    val[idx] = val[jdx];
                    val[jdx] = temp; 
                }

            }
            
        }
        
    }
    
}
