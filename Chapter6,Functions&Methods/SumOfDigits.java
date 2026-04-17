import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("the sum of integers are:" + sumOfInteger(x));
        
    }

    public static float sumOfInteger(int x){
        int sum=0;
        while( x!=0){
            int y = x% 10;
            x = x/10;
           sum += y; 
        }
        return sum ;

    }
    
}
