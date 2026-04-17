import java.util.Scanner;
public class Question2 { // Sum of numbers in the SECOND Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the no.of colums :");
        int c= sc.nextInt();
        int sum =0;
        
        int[][] nums = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                nums[i][j] = sc.nextInt();   
            }
        }
        // Counting 7's
        for(int i=1;i<2;i++){ // Cause need sum of 2nd row, means r =1 here
            for(int j=0;j<c;j++){
                
                sum += nums[i][j];
            }
        }
        System.out.println("Tee sum of elements in the 2nd row is:"+ sum);
    }
    
}
