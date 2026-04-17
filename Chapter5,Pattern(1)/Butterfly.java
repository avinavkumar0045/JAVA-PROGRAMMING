import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        System.out.println("please Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //int x =4;
        // 1st Part
        for(int i=1; i<=x;i++){
            for(int j=1;j<=2*x;j++){
                if(j<=i || i+j >= 2*x+1){  // Maza aa gaya
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 2nd Part
       for(int i=1; i<=x; i++){
            for(int j=1;j<=2*x;j++){
                if(i + j <=x+1 || i +j >= i + (i + x)){ // In this 4th part ko individually try krne pe logic banta hai if(i+j >= 2i),
                    System.out.print("*");          // But as here , j is from 5 to 8 , u will have to adjust it by adding 'x'
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
