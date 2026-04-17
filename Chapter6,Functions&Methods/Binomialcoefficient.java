import java.util.Scanner;

public class Binomialcoefficient { // n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
       int n_factorial  = Factorial(n);
       int r_factorial = Factorial(r);
       int nr_factorial = Factorial(n-r);
       System.out.println("The Binomial Coefficient is:");
       System.out.println(n_factorial / (r_factorial * nr_factorial));

    }

    public  static int Factorial (int x){
        if( x== 1 || x == 0){
            return 1;
        }else{
            return x * Factorial( x-1);
        }
    }  
}
