public class CountingSort {
    
    // Print function
    public static void printArr(int nums[]){ // Inbuilt Sort fxn, O(log n)
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    // counting Sort
    public static void CountingSORT(int arr[]){
        int largest = Integer.MIN_VALUE; // for array size , require the largerst element of array

        for(int i=0;i<arr.length;i++){
           largest =  Math.max(arr[i], largest); // found largest element
        }
        
        int count[] = new int[largest + 1]; // Cause, starts from 0, so largest +!
        for(int i=0;i<count.length;i++){ // calculating frequency , 0 to 7
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] =i;
                j++;
                count[i]--; // agar frequencyy kisi ki 2 , hai to usse ghata ke 0 kr denge
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
         CountingSORT(arr);
         printArr(arr);
     
        }
}
    

