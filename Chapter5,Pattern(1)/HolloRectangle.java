public class HolloRectangle {
    public static void main(String[] args) {
        int n =5 , m =4;
        for(int i=1; i<=m;i++){
            for(int j =1;j<=n;j++){
                if(i ==m|| i ==1 || j == 1|| j ==n){
                    System.out.print("*"); // PRINT NOT PRINTLN
                    
                 }else{
                    System.out.print(" ");// PRINT NOT PRINTLN
                 }
            }
            System.out.println(); // HERE NO SPACE
        }
    }
    
}
