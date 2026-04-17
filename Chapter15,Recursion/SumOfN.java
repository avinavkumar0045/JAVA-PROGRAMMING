public class SumOfN {

    public static int sum(int x){
        if( x == 1){        
            return 1;
        }
        int Sxm1 = sum(x-1);
        int Sx= x + Sxm1;
        return Sx;
    }
    
    public static void main(String[] args) {
        int n = 6;
        int result = sum(n);
        System.out.println(result);       
    } 
}


