import java.util.Scanner;

public class SprialMatrix {

    public static void spiralRow(int nums[][],int n){
        
        int startRow =0;
        int startCol = 0;
        int endRow =n-1;
        int endCol = n-1; // matrix[0].length-1
         

        while(startRow<= endRow && startCol <= endCol)
        {
        //top 
        for(int j=startCol;j<=endCol;j++){  // HERE NO BREAK STATEMENT 
            System.out.print(nums[startRow][j]+" ");  //  
        }
        //Right
        for(int i = startRow+1;i<=endRow;i++){ //  
            if(startCol == endCol){
                break;
            }
            System.out.print(nums[i][endCol]+" ");
        }
        //Bottom
        for(int j=endCol-1;j>=startCol;j--){
            if(startRow == endRow){
                break;
            }
            System.out.print(nums[endRow][j]+" ");
        }
        //Left
        for(int i = endRow-1;i>=startRow+1;i--){
            if(startCol == endCol){
                break;
            }
            System.out.print(nums[i][startCol]+" ");
        }
        startCol++; // ek baar jo column aa gaya, uspe to wapis aana hi nahi hai
        startRow++;
        endCol--;
        endRow--;
       
    }
        System.out.println();
    }    
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of rows and columns:");
        int n = sc.nextInt();
       
        //Reading elements from the user.
        int[][] nums = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();   
            }
        }
    
        spiralRow(nums,n);
    }
    
}
