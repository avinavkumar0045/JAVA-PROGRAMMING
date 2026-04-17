import java.util.*;
//Duplicate parenthesis is when you use parenthesis unnesesarily e.g, ((a+b))
public class twoDuplicateParenthesis {

    public static Boolean DuplicateParenthesis(String str){ // O(n)
        Stack<Character> S = new Stack<>();
        for(int i =0; i<str.length();i++){
            char curr = str.charAt(i);
           
             // closing 
            if(curr  == ')'){
                int count =0;
                while( S.peek() != '('){
                    S.pop();
                    count ++;

                }
                if(count < 1){
                    return true; // duplicate 
                }else{
                    S.pop(); // opening pair 
                    
                }           
            }   
            else{
                // opening 
                S.push(curr);
          
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        String str ="((a+b)*c)";
        String str1 = "(((a+b+c)*))";

       System.out.println(DuplicateParenthesis(str1));

    }   
}
