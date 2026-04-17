import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int x1 = x; // Storing x in diff variable for comparing , as it will be modified later on
      
        System.out.println("Is the given number a palindrome ?" + isPalindrome(x,x1));
    }

    public static boolean isPalindrome(int x, int x1) {
       int sum=0;
        while( x>0){
            int y = x% 10;
            x = x/10;
           sum = sum * 10+ y; // IMPORTANT , REMEMBER SUM* 10 + REMAINDER
        }
        return (sum == x1);

        
    }
    
}
