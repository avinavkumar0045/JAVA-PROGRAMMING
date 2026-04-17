import java.util.Arrays;
import java.util.Collections;

public class InbuiltReverseSorting { // Inbuilt Reverse sorting of Array ,// use INTEGER( Cause this collection only works on Object Types)
      public static void printArr(Integer nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer nums[] ={2,3,1,7,4,8,6};
       //  Arrays.sort(nums,Collections.reverseOrder());
        Arrays.sort(nums,0,3,Collections.reverseOrder()); // To Sort a part of Array : Arrays.sort(nums,si,ei,Collections.reverseOrder()); si = starting index, ei = ending index
        printArr(nums); // Calling fxn  
    }             
}
