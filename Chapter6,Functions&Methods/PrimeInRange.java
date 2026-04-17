import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        for(int i =3; i<= 9; i++){  // 2 le liye exttra id condition de do
           System.out.println("Is " + i + " a prime number ? "+ isPrime(i));
        }
    }

    public static boolean isPrime(int n){
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
              return true; // NOT UNDER ELSE CONDITION, BUT AFTER CLOSING FOR BRACKET 
            
        }
    }
    

