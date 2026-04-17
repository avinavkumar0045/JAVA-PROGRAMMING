import java.util.Scanner;

public class ClearIthBit {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enther the bit which you want to clear :");
        int i = sc.nextInt();  // Indexing starts from 0
        int bitMask = ~( 1 << i); // 000001 << 1 = 000010 = 111101
        System.out.println( num & bitMask); // 001010 & 111101 = 001000


    }
    
}
