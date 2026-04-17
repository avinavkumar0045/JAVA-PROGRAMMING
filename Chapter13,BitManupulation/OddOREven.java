import java.util.*;
public class OddOREven {
    public static void main(String[] args) {  
     // LSB = 1 = it is odd   , LSB = 0 = it is even
    /*  so if somehow we find the LSB , we will get out answer, so for that,
        we will perform ( n & 1)= if 1 ,its odd, else even,
       eg. 0101 & 0001 = 0001 = hence odd */
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number :");
       int num = sc.nextInt();

       if( (num & 1) == 1){
       System.out.println("Its a odd number");
      }else{
       System.out.println("its a even number ");
      }
        
    }
    
}
