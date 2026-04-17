// Find number of ways to move from (0,0) to (N-1,M-1) in a N x M grid , Allowed Moves are RIGHT and DOWN( No LEFT, UP)
public class GridWays { // T C O(2 ^ (m+n))
    public static int GridSoln(int i, int j , int n, int m){
        // base case
        if( i == n-1 || j == m-1){ // base case
            return 1;

        }else if(i == n || j == m){ // boundary cross condition
            return 0;
        }
        int w1 = GridSoln(i+1, j, n,m);
        int w2 = GridSoln(i,j+1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n =3, m =3;
        int Ans =  GridSoln(0, 0, n, m);
        System.out.println("the number of answers are :"+Ans);
        

        
    }
}
