public class DiamondPattern { // Given qn mein sirf 7 rows thi, somehow I have to do that , 2nd prt mein sayd condn. dena hoga j>x
    public static void main(String[] args) { // Make matrix for better understanding
        int x =4;
        // TOP Part
        for(int i=1; i<=x ; i++){
            for(int j =1; j<= 2*x ; j++){ // upto 2x
                if( i + j >= x +1 && j -x < i){ // for upper part // $$ yeha (j -x <= i) nahi aayega ( both $ ke jagah <= kr ke check kr lo)
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        //Lower part
        for(int i =1; i<=x;i++){  //** IF U START HERE FROM '2' , BEECHE MEIN 2 FULL LINES NAHI PRINT HONGI( u can put 2 & try)
            for(int j =1; j<= 2*x; j++){ // upto 2x
                if(j>= i && j <= x){ // for only 3rd part(j<5)
                    System.out.print("*");
                }else if(j >x && i +(j) < 2*x + 1){ // for ONLY  4th part (j>4) //$$ yeha (i+ j <= 2*x + 1) nahi aayega
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
