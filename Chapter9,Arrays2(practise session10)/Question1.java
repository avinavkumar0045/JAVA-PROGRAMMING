import java.util.Scanner;

public class Question1 {

    public static boolean Repetition(int nums[]){// Return true if any value repetes itself
        Scanner sc = new Scanner(System.in);
        int n = nums.length; // shortform for length
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
      
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt(); // enter the no.of elements
        int []nums = new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();   
        }
         System.out.println(Repetition(nums));
    }
    
}
