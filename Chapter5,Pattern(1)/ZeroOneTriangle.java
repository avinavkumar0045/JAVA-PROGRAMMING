public class ZeroOneTriangle {
    public static void main(String[] args) { // GOOD QUESTION
        int x =5;
        for(int i =1; i<=5; i++){
            for(int j=1; j<= x; j++){
                if( j <= i){  // Nested if statements
                    if( (i - j) % 2 == 0){ // IMPORTANT ,PATTERN NAHI DIKHE TO HAR MATRIX KE POSITION PE COORDINATES LIKH KE LOGIC BANAO
                    System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }else{
                    System.out.print(" "); // Not necessary in this qn.
                }
            }
            System.out.println();
        }

        // Another approch, FOR ALTERNATE PRINTING
       /*  boolean check = true;

        for(int i=1;i<= 5; i++){
            for(int j=1; j<= 5; j++){
                if(j <= i){
                if(check == true){
                System.out.print("1");
                } else{
                    System.out.print("0");
                }
               check =!check;
            }
        }
            System.out.println();
        }*/
    }
    
}
