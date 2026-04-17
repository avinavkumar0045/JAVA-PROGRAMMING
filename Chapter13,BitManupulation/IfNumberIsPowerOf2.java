import java.util.*;

public class IfNumberIsPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if ((num & (num - 1 )) == 0){  // 4 & 3 = 0100 & 0011 = 0000
            System.out.println("the number is power of 2");
        }else{
            System.out.println("The number is  not power of 2");
        }

    }
    
}
