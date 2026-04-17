

public class BinaryOperators { // SINGLE SYMBOL
    public static void main(String[] args) {
        // & Operator
        System.out.println(5 & 6); // 0101 & 0110 = 0101 =4
        // | Opertor
        System.out.println(5 | 6); // 0101 | 0110 = 0111 = 7
        // XOR operator
        System.out.println( 5 ^ 6); // 0101 ^ 0110 = 0011 = 3
        // ~ operator
        System.out.println(~5);
        // << (left Shift) operator
        System.out.println(5<<2); // 000101 <<2 = 10100 = 20, fromula a<<b = (a * (2^b))
        // >> (RIght Shift)operator
        System.out.println(5 >>2 ); // 000101 <<2 = 000001 = 1, formula a>> b = a/ (2^b)
        
    }
    
}
