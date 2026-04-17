import java.util.Scanner;

public class OptimisedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
       System.out.println( isPrime(7));

    }

                   public static  boolean isPrime(int n){
                   for(int i=2; i<= Math.sqrt(n); i++){
                     if(n % i == 0){
                       return false;
                      }
                      }
                      return true;  // DONT GIVE THIS RETURN IN ELSE STATEMENT , NAHI TO ERROR SHOW KRGA,
                     // ISKO FOR LOOP KA BRACKET CLOSE KR KE, RETURN UNDER FXN
                    }  
                }
            
    

