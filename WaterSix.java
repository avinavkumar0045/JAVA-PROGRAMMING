// Write a program to reverse each row in a 2D array.

public class WaterSix {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4}};
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2/2;j++){ // while reversing only half way through
                int temp = arr[i][j];
                arr[i][j] = arr[i][2-1-j];
                arr[i][2-1-j] = temp;
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }   
    }        
}
