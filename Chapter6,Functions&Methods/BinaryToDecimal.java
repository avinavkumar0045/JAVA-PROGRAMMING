import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) { // READ THE CODE TO PRINT THE LOGIC
        Scanner sc = new Scanner(System.in);
        int BinNum = sc . nextInt();
        BinToDec(BinNum);
    }
    public static void BinToDec(int BinNum){
        int pow =0;
        int decNum =0;
        int duplicate =  BinNum;

        while(BinNum > 0){
            int lastdigit = BinNum % 10;
            decNum = decNum + lastdigit * (int) Math.pow(2,pow); // har digit ko 2 ki power se multiply kro, and pow++
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("The decimal value of " + duplicate + " is " + decNum);
    } 
}
