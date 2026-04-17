/* 
 Create a program to take a number as input and reverse the number. 
 To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order */


public class WaterThirteen {
    public static void main(String[] args) {
        int number = 12345;
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
        int temp2 = number ; 
        int arr[] = new int[count];
        int i = 0;
        while( temp2 >0){
            int r = temp2 % 10;
            temp2 = temp2 / 10;
            arr[count-1-i] = r;
            i++;
        }
        // orignal array
        for(int k = 0;k<5;k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        for(int k = 0;k<arr.length-1; k++){
            for(int j = 0;j<arr.length-1 ; j++){
                if(arr[j] < arr[j+1]){
                    int curr = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = curr;
                }
            }
        }
        for(int k = 0;k<5;k++){
            System.out.print(arr[k] + " ");
        }

        
    }
}
