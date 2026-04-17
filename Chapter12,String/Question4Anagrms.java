
import java.util.*;  //Important // Anagram means , both string are same but elements are aage peeche.
public class Question4Anagrms {
    public static void main(String[] args) {
        String str = "eat";
        String str1 = "tea";

        char[] strArr = str.toCharArray(); //['e','a','t']
        char[] str1Arr = str1.toCharArray();//['t','e','a']

        Arrays.sort(strArr);
        Arrays.sort(str1Arr);

        System.out.println( Arrays.equals(strArr,str1Arr));

       
        
    }
    
    
}
