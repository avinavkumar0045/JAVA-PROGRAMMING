import java.util.*;
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex C = new Complex();
        C.sum( a,b,c,d);
        C.diff(a,b,c,d);
        C.Pdt(a,b,c,d);
        
    }
    
}

class Complex{
    int SumR =0 ; int diffR  = 0; float pdtR = 0;
    int SumI = 0; int  diffI = 0; float pdtI = 0;


    void sum (int r1, int r2, int i1 , int i2){
         SumR = r1 + r2 ;
         SumI = i1 + i2;

         System.out.println("The sum of two Complex Number is : ");
         System.out.println(SumR +" + " + SumI+"i");
    }
    void diff (int r1, int r2, int i1 , int i2){
        diffR = r1 - r2 ;
        diffI = i1 - i2;

        System.out.println("The difference of two Complex Number is : ");
        System.out.println(diffR +" + " + diffI+"i");
   }

    void Pdt (float r1 , float r2, float i1, float i2){
        pdtR = r1 * r2;
        pdtI = -( i1 * i2);
        System.out.println("The product of two Complex Number is : ");
        System.out.println(pdtR +" + " + pdtI+"i");


      

   }
}
