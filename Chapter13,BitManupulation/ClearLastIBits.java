
import java.util.Scanner;
public class ClearLastIBits { // Clear last i bits
    public static void main(String[] args) { // eg. 1111, i =2 => 1100
        // -1 = 111111 = ~0 , 
        //  BitMask => ~(0) << i(2) = 111100
        // num & BitMask = 111100 // ( num = 111111) depends upon user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the number of ith bits you want to remove :");
        int i = sc.nextInt();
        
       int BitMask = ~(0) << i;
       System.out.println( num & BitMask);

        

        
    }
    
}
