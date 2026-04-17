public class IIqn { //  decreasing and then decreasing
    public static void printIncDec(int x, int Xcopy){ // a copy of x for comparing num varriable
      
        int num =0;
        if(x == 1){
            System.out.println(x);
             num = x;
            
        }

        if(num != 0 && num <= Xcopy){
            System.out.println(num+1);
            printIncDec(num+1,Xcopy);
            
          

        } 

        System.out.println(x);
        printIncDec(x-1,Xcopy);

    }

    public static void main(String args[]){
        int x = 7;
        printIncDec(x, x);
        
    }
    
}
