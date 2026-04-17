public class HollowRhoumbus {
    public static void main(String[] args) { 
        
    int x =5;
    for(int i=1; i<=5; i++){
        for(int j =1; j<= 2* x - 1; j++){
            if(i + j == (x+1) || i+j == 2* x ){ // For 1st / and 2nd / line 
                System.out.print("*");
            }else if( i == 1 && j >=5){ // for 1st row filling
                System.out.print("*");
            }else if( i == x && j<=x){ // For 2nd row filling
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
}
}
