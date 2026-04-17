// Write a program to rotate an array to the right by k steps.
import java.util.Arrays;
public class WaterFive {
        // Function to rotate the array to the right by k steps
        public static void rotateRight(int[] arr, int k) {
            int n = arr.length;
            k = k % n; // In case k is larger than the array length
    
            // Reverse the entire array
            reverse(arr, 0, n - 1);
            // Reverse first k elements
            reverse(arr, 0, k - 1);
            // Reverse the remaining n-k elements
            reverse(arr, k, n - 1);
        }
    
        // Helper function to reverse elements in array from start to end
        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
    
            System.out.println("Original array: " + Arrays.toString(array));
            rotateRight(array, k);
            System.out.println("Array after rotating to the right by " + k + " steps: " + Arrays.toString(array));
        }
}

public static void RotateRight(int arr[] , int k){
    
    int n = arr.length;
    k = k % n;
    reverse(arr , 0 , n-1);
    reverse(arr , 0 , k-1);
    reverse(arr , 0 , n-1);
}
public static void reverse(int arr[] , int start , int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]  = temp;
        start ++;
        end --;

    }
}
