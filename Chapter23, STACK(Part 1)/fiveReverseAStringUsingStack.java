import java.util.*; //✨✨✨🌟🌟 Bhai ye to khasiyat hai Stack ki jaise push karoge , uske opposite pop hoga

public class fiveReverseAStringUsingStack {

    public static StringBuilder ReverseString( String Str ,Stack<Character> s){
        StringBuilder result = new  StringBuilder();
        for(int i =0; i<Str.length(); i++){
            char curr = Str.charAt(i);
            s.push(curr); // into the stack
        }
        while(!s.isEmpty()){
            
            char ch = s.pop();
            result.append(ch);
        }
        return result;      
    }
    public static void main(String[] args) {
        
        Stack<Character > s = new Stack<>(); 
        String Str = "Nitin";
              
       StringBuilder result =  ReverseString(Str, s);
         
        System.out.println(result);

    }  
}
