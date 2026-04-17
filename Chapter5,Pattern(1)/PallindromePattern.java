public class PallindromePattern {
    public static void main(String[] args) {
        int x =5;
        for (int i =1; i<=x ; i++){  // Look at this pattern
            for(int j =0; j<(x); j++){
                if(i+j < x+1){
              System.out.print(" ");
                }
            }
              int num=i;
              boolean decreasing = true;
               while(num <= i){  // num <= i, nahi to infinite loop chalega
                System.out.print(num);
                if(num == 1){  // VERY IMPORTANT
                    decreasing = false;
                }
                if(decreasing == true){
                    num--;
                }else{
                    num ++;
                }
            }
            System.out.println();      
        }        
    }
    
}
