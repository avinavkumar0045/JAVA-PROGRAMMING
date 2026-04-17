
public class factorial{ 

 public static int factorial(int x) { // O(n)// as called n times
    
    if(  x == 0){
     
        return  1;
    }
    return x * factorial(x-1);
}
    public static void main(String[] args) {
        int n = 6;
      int result =   factorial(n);   
      System.out.println("Factorial of " +n+" is " + result );

    }
    
}

