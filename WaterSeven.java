// Given a matrix, write a method to transpose it.
public class WaterSeven {
    public static void input(int arr[][]){
        
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = new int[3][3];
        for(int i = 0;i< 3;i++){
            for(int j =0;j< 3;j++){
                arr1[j][i] = arr[i][j];                 
            }
        }

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
