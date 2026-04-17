
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int sum =0;
        float average = 0;
        System.out.println("Enter the numbers:\n");
        for(int i =0; i<6; i++){
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            sum+= input;

        }
        average = (float)sum /6;
        System.out.println("the average is:" + average);
    }
    
}
