import java.util.Arrays;
public class InbuiltSort {

    public static void printArr(int nums[]){ // Inbuilt Sort fxn, O(log n)
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] ={2,3,1,5,4,8,6};
       // Arrays.sort(nums); // O(log N) // TO sort the whole Array
       // System.out.println(nums);
       // printArr(nums);  // calling fxn
       // System.out.println("\n");
        Arrays.sort(nums,3,5); // To Sort a part of Array : Arrays.sort(nums,si,ei); si = starting index, ei = ending index
        printArr(nums); // Calling fxn
        
                
    }      
    
}
