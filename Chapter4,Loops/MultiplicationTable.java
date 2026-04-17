import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(x * i);
        }
    }
    
}
