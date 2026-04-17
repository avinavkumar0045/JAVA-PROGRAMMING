import java.util.Scanner;

public class ClearRangeOfBits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int num = sc.nextInt();
        System.out.println("Enter the lower range of number to remove :");
        int i = sc.nextInt();
        System.out.println("Enter the upper range of number to remove :");
        int j = sc.nextInt();
        int a = ((~0) << (j+1));
        int b = ( 1<< i) -1;
        int bitMask = a | b;
        System.out.println( num & bitMask);
    }
    
}
