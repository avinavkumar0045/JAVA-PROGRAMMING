public class SolidRhombus {
    public static void main(String[] args) {
        int x =5;
        for(int i =1; i<=x; i++){
            for(int j=1; j<= 2* 5; j++){
                if( i+ j> x && i+ j <= 2 * x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
