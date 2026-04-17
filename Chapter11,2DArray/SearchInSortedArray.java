import java.util.Scanner; // when given array is sorted in both row and column , StairCase Method

public class SearchInSortedArray {

    public static void foundtarget(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >=0 ){
            if(matrix[row][col] == key){
               System.out.println("The index is :["+row+","+col+"]"); 
            }if(matrix[row][col] < key){ // Matlb remove column
                row++;
            }else{ //matrix[row][col] > key  // Matlab remove row
                col--;
            }
        }
    }
    public static void main(String[] args) { // Stair Case Search
        Scanner sc = new Scanner(System.in);
        int matrix[][] ={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50} };
        System.out.println("Enter the number to search:");                
        int key = sc.nextInt();
       
        foundtarget(matrix,key);


        
        
    }
    
}
