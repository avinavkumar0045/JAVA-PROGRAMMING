import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        int sumEven = 0,sumOdd = 0, number, choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the integer:");
            number = sc.nextInt();
            if(number % 2 == 0){
                sumEven += number;
            }else{
                sumOdd += number;
            }

            System.out.println("Do you want to continue , if yes press 1, if no press 0");
            choice = sc.nextInt();
        } while(choice == 1) ;
        // will print the sum after pressing 0(End)

        System.out.println("Sum of even integers is: "+ sumEven );
        System.out.println("Sum of odd integers is: "+ sumOdd);

       
    }
    
}
