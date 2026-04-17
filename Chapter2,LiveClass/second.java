
import java.util.*;
public class second { // fibonachi
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int  n =6;
        int nextterm = n1 + n2;
        System.out.print( "Fibonaachi :\n" + n1 +" "+ n2+ " ");

        for(int i=2; i<=n; i++){
            System.out.print( nextterm + " ");
            n1 = n2;
            n2 = nextterm;
            nextterm = n1+ n2;
            
        }

        
        System.out.println("\n");
        int x = 153; // ARMSTRONG Number, digits ke cube ka sum = original number
        int sum =0;
        int y = x;
        while(x !=0){
            int digit= x % 10;
            sum  += digit*digit*digit;
            x = x/ 10;
            
        }
        if( sum == y){
            System.out.println(" it is a armstrong nmber");
        } else{
            System.out.println("Not an armstrong number");
        }
        
    }
    
}
