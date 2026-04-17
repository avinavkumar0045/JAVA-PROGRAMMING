import java.util.*;
public class PalindromePartitioning {
    public static void SubSet(String str, int i, String ans ,List<List<String>> res ){ //t = O(n * 2^n)
        if( i == str.length()){ // SC = o(n)

            if( ans.length() == 0){
               // System.out.println("Null");
            }else{
                int start = 0; int end = ans.length()-1; int pointer = 0;
                while(start < end){
                    if(ans.charAt(start) == ans.charAt(end)){
                        start ++; end --;
                    }else{
                        pointer = 1;
                        break;
                    }
                }
                if(pointer == 0){
                    System.out.println(ans);
                }
                
            }
            return; // JAVA mein passs by value hota hai, to when you return , the changes get erased
        }
        SubSet(str, i+1, ans+str.charAt(i) , res);  // YES wali line
        SubSet(str,i+1, ans , res); // No wali line
    }

    public  static void main(String args[]){
    String str = "aab";
    String ans  = "";
    List<List<String>> res = new ArrayList<>();
    SubSet(str, 0, ans , res); // ans is the string to which the answer will be copied

    }
}
