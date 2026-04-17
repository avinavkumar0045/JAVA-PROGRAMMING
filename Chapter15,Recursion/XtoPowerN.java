public class XtoPowerN {

    public static int Power(int x, int y){
        if(x == 0 || x == 1){
            return x;
        }else if(y == 0){
            return 1;
        }
        int powxm2 = Power(x,y-3) * x; // ye bhi define kro , x-1 hi nahi
        int  powx1 = powxm2 * x; // noise
        int powx = powx1 * x;
        return powx;

    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
       int result =  Power(x, y);
       System.out.println(result );

    }
    
}
