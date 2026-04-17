// in O(log N)
// ismein phele x to power y/2 nikal lenge time complexity kam krne ke liye
public class OptimisedXtoPower{
    public static int Power(int x, int y){
        // base case 
        if(x == 0 || x == 1){
            return x;
        }else if(y == 0){
            return 1;
        }
        // basic logic 
        int powxm2 = Power(x,y/2-3) * x; // yeha y /2 se divide krenge 
        int  powx1 = powxm2 * x; // noise
        int powx = powx1 * x;

       // just one more variable to shpw clean
        int halfpowsq = powx * powx; // x to power y/2

       // 2 test case
        if( y % 2 == 0){ // if 2 se pura hi divide ho jaye 
          return  halfpowsq ;
        } else{
            return halfpowsq * 2;  // if 2 se pura divide na ho 
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 7;
       int result =  Power(x,y);
       System.out.println(result);

    }   
}
