import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Is the entered number even?" + isEven(x));
    }
    
    public static boolean isEven(int x){
        return (x % 2 == 0);
    }
    
}
