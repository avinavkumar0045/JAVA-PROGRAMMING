
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  done =0;
        
        for(int i=2; i<num-1; i++){
            if(num% i == 0){
                System.out.println("the number is not prime");
                done = 1;
                break;
            }
        }
        if(done == 0){
            System.out.println("its a prime number");
        }
        
    }
    
}
