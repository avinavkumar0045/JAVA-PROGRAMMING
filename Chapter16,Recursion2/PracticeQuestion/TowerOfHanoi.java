

public class TowerOfHanoi {
    public static void toh(int n, int A, int C, int B ){ // move n disks from A to C using B 
        // base case 
        if( n == 0){
            return;
        }
        toh(n-1, A, B, C); // A -> B -> C , for n-1
        System.out.println("Moving " +  n + "th disk from "+ A + "th  to "+ C+"th Rod");
        toh(n-1,B,C,A); 


    }
    public static void main(String[] args) {
        int n =3;
        int a = 10;
        int b = 20;
        int c = 30;
        toh(3,a,c,b);

        
    }
    
}
