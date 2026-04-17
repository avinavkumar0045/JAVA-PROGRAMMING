public class Knight {

    static int N =8;

    public static boolean isSafe(int x, int y , int sol[][]){

        return (x >= 0 && y >= 0 && x < N && y<N && sol [x][y] != -1);
    }

    public static void PrintSolution(int sol[][]){
        for(int i =0; i<N ; i++){
            for(int j =0; j<N ; j++){
                System.out.print(sol[i][j] +" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int x = 0; int y =0;
        int[][] sol  = new int [N][N] ;
        isSafe(x,y,sol);
        
    }
    
}
