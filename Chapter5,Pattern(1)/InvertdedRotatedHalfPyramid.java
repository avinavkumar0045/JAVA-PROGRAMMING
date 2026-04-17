public class InvertdedRotatedHalfPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int c =1;c<=i;c++){ //DOUBLE LOOP USE KRO
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
