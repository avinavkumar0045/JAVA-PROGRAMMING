

public class FrinedsPairingProblem { // either single or pair
    public static int FreindsPair(int n){
        if(n == 1|| n == 2){
            return n;
        }
    
       // KAAM
       // Single 
       int Single = FreindsPair( n-1); // sab ek ek to n ways 
       // pair
       int pair = (n-1) * FreindsPair( n-2); // kyu ki jinka pair ban gaya , they cannot participate again
       // n-1 cause a can pair with 
       
       return Single + pair;

    }
    public static void main(String[] args) {
        int persons = 3;
       int result =  FreindsPair(persons);
       System.out.println( " NO of ways to stand = "+result );
        
    }
    
}
