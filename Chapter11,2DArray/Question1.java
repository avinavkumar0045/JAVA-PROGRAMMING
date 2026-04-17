import java.util.Scanner; // Count No. of elements in the matrix

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the no.of colums :");
        int c= sc.nextInt();
        int count =0;
        
        //Readng elements from the user
        int[][] nums = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                nums[i][j] = sc.nextInt();   
            }
        }
        // Counting 7's by searching
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(nums[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("No of 7's in the matrix are :"+ count);

    }
    
}
