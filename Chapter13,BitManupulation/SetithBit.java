import java.util.Scanner;

public class SetithBit {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number :"); //change sirf wahi laa sakta hai , jaha number mein 0 ho aur, 1 mein change krna ho
       int num = sc.nextInt();
       System.out.println("Enther the bit which you want set :");
       int i = sc.nextInt();
       int bitMask = 1<<i;  // 000001  << 2 = 000100  // indexing starts from 0
       System.out.println(num | bitMask);
      /*  if ((num | bitMask) == 0){ // aab isko num(5){ 000101 } ke sath | kar do, to wo change ho jeiga
        System.out.println("The bit is 0");
       }else{
            System.out.println("The bit is 1");
        } */


       
    }
    
}
