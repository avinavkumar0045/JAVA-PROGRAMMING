import java.util.Scanner;
public class CountSetBits {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeber :");
        int num = sc.nextInt();
        while (num >0){
           if ( (num & 1 ) != 0){ // Check our LST
            count ++;
           }
            num = num >> 1; // ek ek kar ke right shift krenge tabhi to , total bits count krenge     
       }
       System.out.print("total bits are : "+ count);
       

    }
    
}
