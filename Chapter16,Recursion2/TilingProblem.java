// Ek( 2 x n )ka board hai aur isko tiles(2 x 1) se bharna hai . //  notes 22/1/25
// tile can be places vertically or horizontally

public class TilingProblem {   // returns number of ways 
    public static int tiling (int n){
        if( n == 1 || n == 0){ 
            return 1;
        }
        
        // kaam 
        // vertical choice 
        int fnm1 = tiling(n-1);

        // horizontal choice 
        int fnm2 = tiling(n-2);

        return fnm1+ fnm2;


    }

    public static void main(String[] args) {
        int n = 3; // returns 3 ways 
        int result = tiling(n);
       System.out.println( result + " ways");


        
    }
    
}
