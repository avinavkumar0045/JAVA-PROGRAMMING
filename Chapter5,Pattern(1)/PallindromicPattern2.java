public class PallindromicPattern2 {
    public static void main(String[] args) { // Incomplete 2nd half
        int x=5;
        /*for(int i=1;i<=x;i++){
            for(int j =5;j >=1;j--){ // J from 5 to 1 
                if(i + j <= 2*i){ // for first part
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

            for(int j = x+1 ; j<=2 * x; j++){
                
            }
        }*/

        
            // Also in notes of javayoutube(chapter 6)
    
              /*   for(int i=1; i<= x; i++){
                    for(int j=1; j<=x; j++){
                        if((i+ j )<= x){ //LHS ka space print kara do, baaki jagah (star + space)
                            System.out.print(" ");
                        }else{
                            System.out.print(i +" ");// baaki jagah (star + space)
                        }
                    }
                    System.out.println();
                }*/

                for (int i =1; i<=x ; i++){  // Look at this pattern
                    for(int j =0; j<(x-i); j++){
                        if(i+j < x+1){
                      System.out.print(" ");
                        }
                    }

                      int num=1;
                      boolean increasing = true;
                       while(num >0){
                        System.out.print(num);
                        if(num == i){
                            increasing = false;
                        }
                        if(increasing == true){
                            num++;
                        }else{
                            num --;
                        }
                    }
                    System.out.println();
                
                }   
    }
    
}
