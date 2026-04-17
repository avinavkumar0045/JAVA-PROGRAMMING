import java.util.*;
public class Factorial {
    public static int calcfactorial(int x){
        
        if(x == 0 || x == 1){
         return 1;
        }else{
            return x * calcfactorial(x -1);
        }
    }
    public static void main(String[] args) {
        int factorial;
        System.out.println("enter x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       int result = calcfactorial(x);
        System.out.println("Factorial is : "+ result);
    }
    
}

//ANOTHER METHOD
/* 
public static void main(String[] args){
    System.out.println("Enter any positive number");
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    int fact =1;
    for(int i=num; i>=1 ; i--){
        fact*= i;
    }
    System.out.println("factorial is:"+fact);

}
}*/
