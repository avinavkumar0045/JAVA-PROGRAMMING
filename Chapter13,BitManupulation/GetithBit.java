import java.util.Scanner;

public class GetithBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number :");
       int num = sc.nextInt();
       System.out.println("Enther the bit which you want to check:");
       int i = sc.nextInt();
       int bitMask = 1<<i;  // 000001  << 2 = 000100 
       if ((num & bitMask) == 0){ // aab isko num(5){ 000101 } ke sath & kar do, to pata chal jaiega, ki wo bit kya thi
        System.out.println("The bit is 0");
       }else{
            System.out.println("The bit is 1");
        }


       
    }
    
}
