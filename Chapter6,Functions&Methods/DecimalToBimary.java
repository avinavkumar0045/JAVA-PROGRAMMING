import java.util.Scanner;
public class DecimalToBimary {
    public static void main(String[] args) {  // READ THE CODE TO PRINT THE BINNUM
        System.out.println("Enter the binary number :");
        Scanner sc = new Scanner(System.in);
        int DecNum = sc.nextInt();
        DecToBin(DecNum);

    }
    public static void DecToBin(int DecNum){
        int duplicate = DecNum;
        int pow = 0;
        int BinNum =0;
        while(DecNum > 0){
        int rem =  DecNum % 2;
        BinNum = BinNum + (int)(rem * Math.pow(10, pow)); // Direct remainder print karayenge to ulta print hoga
        pow ++;
        DecNum = DecNum / 2;
        }
        System.out.println( "the binary form of " + duplicate +" is " + BinNum);

    }
    
}
