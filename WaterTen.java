import java.util.*;
public class WaterTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int []number = new int[n];
        for(int i=0;i<n;i++ ){
            number[i] = sc.nextInt();
        }
        boolean ans = fxn(n , number);
        if(ans == true){
            System.out.println("YES ");
        }else{
            System.out.println("No");
        }
        
    }
    public static boolean fxn(int n, int[] number){

        for (int idx = 0; idx < number.length-1; idx++) {

            if(number[idx] %2 == 0 && number[idx+1]%2 == 0){
                
                return false;
            }
            if(number[idx] %2 != 0 && number[idx+1]%2 != 0){
                
                return false;
            }  
        }
       
        return true;
    }
}
