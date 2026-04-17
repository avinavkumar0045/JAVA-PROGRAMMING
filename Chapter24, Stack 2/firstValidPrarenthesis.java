import java.util.*; // Did this in LeetCode
public class firstValidPrarenthesis {
    public static boolean ValidParenthesis(String Str){
        Stack<Character> St = new Stack<>();
        int n = Str.length();

        for(int i=0; i<n ; i++){
            char curr = Str.charAt(i);
            
            // Opening condition
            if(curr == '(' || curr =='{' || curr == '['){
               St.push(curr);

            }else{
                if(St.isEmpty()){
                    return false;
                }

                else if (curr == ')' && St.peek() != '(') {
                    return false;

                } else if (curr == '}' && St.peek() != '{') {
                    return false;

                }else if (curr == ']' && St.peek() != '[') {
                    return false;

                }
                St.pop();
            }
        }
        if( St.isEmpty()){
            return true ;
        }else{
            return false;
        }  
           
    }
    public static void main(String[] args) {
        String S = "()[]}";

        Boolean result = ValidParenthesis(S);
        System.out.println(result);


    }
    
}
