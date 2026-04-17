// recursion // print incresing and decreasing numbers
public class Iqn {

    public static  void printDec(int x){
        if( x == 1){
            System.out.println(x);
            return;
        }
        System.out.print(x+" ");
        printDec(x-1);
    }
    /*   (OR)
    public static void printDec(int x){
        if(x == 0){
            return  ;
        }
        System.out.println(x);
        printDec(x-1);

    } */

    public static void printInc(int x){
        if( x == 1){
            System.out.print(x+" "); 
            return;
        }
        // these 2 lines will not be eecuted for 1
        printInc(x-1); // Done mein bass upar neeche ka antar hai, ek mein print statememt aage hai aur ek mein peeche
        System.out.print(x+" ");
    }
    
    public static void main(String[] args) {
        System.out.println("Numbers are :");
        int n = 10;
        printDec(n);
        printInc(n);          
     }
  
}

