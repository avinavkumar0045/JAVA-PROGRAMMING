import java.util.Scanner;
public class Question2 { // Rotated kr ke diya hai

    public static int Index(int nums[],int target){ // Reuturn the index of target element, and if not present return -1
    
    

    for(int i=0;i<nums.length;i++){
        if(target == nums[i]){
           return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int nums[] ={4,5,6,7,2,0,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        System.out.println(Index(nums,target));
    }
    
}
