/* Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
*/
public class Water {
    public static void prime(int a){
        int ans =0;
        for(int i=2;i<a;i++){
            if(a % i ==0){
                ans =1;
            }
        }
        if(ans == 1){
            System.out.println("The number "+a+" is a prime number");
        }else{
            System.out.println("The number "+a+" is not a prime number");
        }
    }
    public static void neon(int a){
        int temp = a;
        int sum =0;
        while(temp > 0){
            int r = temp % 10;
            temp = temp / 10;
             sum += r;
        }
        if( a*a == sum){
            System.out.println("the number is a neon number");
        }else{
            System.out.println("the number is not a neon number");
        }
    }

    public static void spy(int a){
        int temp =a;
        int sum = 0;
        int pdt =1;
        while( temp >0 ){
            int r= temp % 10;
            temp = temp / 10;
            sum += r;
            pdt *= r;
        }
        if( pdt == sum){
            System.out.println("the number is a spy number");
        }else{
            System.out.println("the number is not a spy number");
        }

    }
    public static void automorphic(int a){
        int square = a*a;
        if( square % 10 == a){
            System.out.println("The number is an automorphic number");
        }else{
            System.out.println("the number is not an automorphic number "); // 1,00,000  9,99,999
        }
    }
    public static void buzz(int a){
          if ( a% 7 == 0 || a% 10 == 7){
            System.out.println("The number is a buzz number");
          }else{
            System.out.println("The number is not a buzz number");
          }
    }
    public static void OTP(){
        int arr[] = new int[10];
        for(int i = 0;i<arr.length ;i++){
            arr[i] = (int)(Math.random() * 999999)+ 100000;
        }
        for(int i = 0;i< arr.length-1;i++){
             if(arr[i] < arr[i+1]){
                 int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] =temp;
             }
        }
        for(int i = 0;i< arr.length -1; i++){
            if( arr[i] == arr[i+1]){
                System.out.println("There is a repeated number");
                return ; 
            }
        }
        System.out.println("the OTPS are different");
        return ;
    }


    public static  void main(String args[]) {
      int a = 5;
      prime(a); // to check wheter a number is prime or not 

      neon(9); // to check neon or not eg 9; 9*9 = 81 => 8+1 == 9
      spy(1124); // 1*1*2*4 == 1+1+2+4
      automorphic(5);
      buzz(14);
      OTP();


    }     
}
