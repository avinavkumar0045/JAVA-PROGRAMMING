import java.util.*;
public class sixFirstNonRepeatingLetterInAQueue {
    
    public static void PrintNonRepeating(String str){
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch -'a']++; // updating frequency 
        }
        while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
            q.remove();
        }

        if(q.isEmpty()){
            System.out.println(-1 + " ");
        }else{
            System.out.println(q.peek()+"  ");
        }
    }
    public static void main(String args[]){
        String str = "aabccxb";
        PrintNonRepeating(str);
    } 
}
