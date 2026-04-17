import java.util.*;

public class AverageOf3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        System.out.println("Enter 3rd number");
        int z = sc.nextInt();
        System.out.println("the average of 3 entered number is :" + average(x,y,z)); // call with parameters
    }

    public static float average(int x, int y, int z){  // Function definition
        return (x+y+z) / 3;
    }
}


    

