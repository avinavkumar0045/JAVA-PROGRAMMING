// KHUD SE KIYA HAI 😎😎😎🫠🫠♦︎♦︎♦︎

public class Qn2 { // Print the number by converting it to string and print it in words

    // REMEMBER STRINGBUILDER IN THIS 
    public static StringBuilder InWords(int x ,StringBuilder str){
        // CASES
        if(x == 0){
            System.out.print(str.append(" zero") );
        }else if(x == 1){
          
            System.out.print(str.append(" one"));
        }
        else if(x == 2){
            System.out.print(str.append(" two"));
        }
        else if(x == 3){
            System.out.print(str.append(" three"));
        }
        else if(x == 4){
            System.out.print(str.append(" four"));
        }
        else if(x == 5){
            System.out.print(str.append(" five"));
        }
        else if(x == 6){
            System.out.print(str.append(" six"));
        }
        else if(x == 7){
            System.out.print(str.append(" seven"));
        }
        else if(x == 8){
            System.out.print(str.append(" eight"));
        }
        else if(x == 9){
            System.out.print(str.append(" nine"));
        }

        
        return  str; // returning answer

        
    }
    public static void main(String[] args) {
        int num = 2019;
        int ReversedNum  = 0; // 1 -> First we will have to revers the number ;
        
        while(num != 0){
            int x  = num % 10 ;
           num =  num / 10;
            ReversedNum = ReversedNum * 10 + x;
         
        } 
        System.out.println(ReversedNum);

        while(ReversedNum != 0){ // 2-> Now will take out the each digit of the reversed NUmber and get them appended , so we ger thr correct answer
            int x1  = ReversedNum % 10 ;
           ReversedNum =  ReversedNum / 10;
            
            InWords(x1,new StringBuilder("")); // 2 -> calling the function for x1( each number we got by doing modulus)
        }
       
       
    }
    
}
