
public class NQueens { // TC = O( n!) -> n * (n-1) * (n-2)* ..... 1
    // 2
    public static boolean isSafe(char board[][] , int rows , int col){ //
        // vertical up
        for(int i =rows-1 ; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;            
            }
        }
        //diag left up
        for(int i = rows-1, j = col-1; i>=0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diag right up
        for(int i = rows-1 , j = col+1; i>= 0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true; // above all conditions are false

    }
   // static int count =0;
    // 1
    public static void  Nqueen(char board[][] , int row){
        // base Case
        if(row == board.length){
            PrintBoard(board);
          // count++; // The time complexity for counting the number of solutions will also take same O(n!)
            return ;
        }
        // column loop
        for(int j=0; j<board.length;j++){
            if(isSafe(board , row ,j)){ // 3 ye condition hum  banayenge 
            board[row][j] = 'Q'; // hum yeah pe har column mein jaake aabhi ke liye Queen bitha diya 

            Nqueen(board , row+1); // function call kiya ( row + 1) 
            /* Pura call kr ke aage tak gaya aur phas gaya
            thn aab backtrack kr ke delete it from that place , or else true hoga to reh jeiga  */
            board[row][j] = '_'; // backtracking step , this is to remove the queen after we palce it and check it . Agar nahi ban raha hai to we will remove it 

            }

        }
    }
    // 3
    public static void PrintBoard(char Board[][]){ // this will print all the different combinations of the chess board of 2 * 2 
        System.out.println("----------- Chess Board --------------");
        int n = Board.length;
        for(int i =0; i<n ; i++){
            for(int j =0; j<n ; j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =4;  // 0 for N = 3
        char board[][] = new char[n][n];
        // initializing board
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                board[i][j] = '_'; // initializing as empty 
            }
        }
        Nqueen(board, 0);
       // System.out.println("The number of solution present is : " + count);
       
    }
    
}
