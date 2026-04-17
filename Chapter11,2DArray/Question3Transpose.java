import java.util.Scanner;
public class Question3Transpose { // Transpose

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the no.of colums :");
        int c= sc.nextInt();
        
        
        int[][] nums = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                nums[i][j] = sc.nextInt();   
            }
        }
        System.out.println("The array is :");
        for(int i=0;i<r;i++){ 
            for(int j=0;j<c;j++){
                System.out.print(nums[i][j]+" ");       
            }
            System.out.println("\n");  
    }
        System.out.println("the transposre of the array is :");
        for(int i=0;i<c;i++){  //  i< columns
            for(int j=0;j<r;j++){ // j < rows
                System.out.print(nums[j][i]+" ");       
            }
            System.out.println("\n");  
    }
    // Roatating 
      System.out.println("the roatated of the array is :");
         for(int i=0;i<r;i++){  //  i< columns
            for(int j=c-1;j>=0;j--){ // j < rows
                System.out.print(nums[j][i]+" ");       
            }
            System.out.println("\n"); 
        }

         
    
}
}
