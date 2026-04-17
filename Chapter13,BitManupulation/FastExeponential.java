import java.util.Scanner;
public class FastExeponential { // ********, calculate (a^N) but jada jaldi
    public static void main(String[] args) {
     // N ko convert to binary form , then 
     // eg. a ^ 5 = (a ^ (101 ))=  (1* a^4) * (1) * (1 * a) = a^4 * a^1 = a^5

     Scanner sc = new Scanner (System.in);
     System.out.println("Enter num :");
     int num = sc.nextInt();
     System.out.println("Enter exponent :");
     int N = sc.nextInt();
     int ans = 1;

     while ( N >0){
        if( (N & 1) != 0){ //  check LSB                // true
            ans = ans * num;                            // 2 * 1 = 2
        } 
        num = num * num; // this is very inportant      // 2 * 2 =2
        N = N >> 1; // RightShift                       // repeat if true
     }
     System.out.println(ans);

        
    }
    
}
