public class Fibbonachi {

    public static int Fibb(int x){ // O(n) space complexity
                                   // time complexity O(2^n) kyuki har level par 2 calls lag rahi hai
        if(x == 0 || x == 1){
            return x;
        }
        int  Fibxm1 = Fibb(x-1) ;
        int Fibx = Fibb(x-1) + Fibb(x-2);
        return Fibx;

    }
    public static void main(String[] args) { 
        int n =6;
        Fibb(n);
        System.out.println(Fibb(n));
    
    }
    
}
