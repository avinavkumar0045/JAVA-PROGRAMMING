import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        
    System.out.println("Enter the day numbr:");
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch(day) {

    case 1:
    System.out.println("its Monday");
    break;
    case 2:
    System.out.println("tuesday");
    break;
    case 3:
    System.out.println("Wednesday");
    break;
    case 4:
    System.out.println("Thrusday");
    break;
    case 5:
    System.out.println("Friday");
    break;
    case 6:
    System.out.println("Saturday");
    break;
    case 7:
    System.out.println("Sunday");
    break;
    default:
    System.out.println("Wrong number for day");
    }
}



    

    
    

    
}
