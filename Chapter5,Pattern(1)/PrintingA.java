import java.util.Scanner;
public class PrintingA {
    public static void main(String[] args) {
        System.out.println("Enter the no.lines(OLNY EVEN NUMER OF LINE):"); // Only EVEN no of lines/rows
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); // No. of rows
        int col = n/2; // NO. of columns

        for(int i=1; i<=n;i++){
            for(int j=1;j<=col;j++){
                 if((i== 1 && j == 1) || ( i==1 && j == col)){ // for(1,1) and (1, col)  pe space print krne ko
                        System.out.print(" ");
                    }else if ( i ==1 || j ==1 || i == n/2 || j == col){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
    
}


