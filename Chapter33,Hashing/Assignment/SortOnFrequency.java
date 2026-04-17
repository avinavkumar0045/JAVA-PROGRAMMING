import java.util.*;

public class SortOnFrequency {
    public static void revmap(TreeMap<Character,Integer> tm){
        TreeMap<Integer,Character> revmap = new TreeMap<>(); // rev Map of (to , from), yeha se starting point nikalenge 
        for(char key : tm.keySet()){
            revmap.put(tm.get(key),key);
        }
        System.out.println(revmap);
        
        for(int key : revmap.keySet()){
            for( int i =0; i<revmap.key;i++){
                
            }

            }

        }
    }
    public static void main(String[] args) {

        String s = "cccaaa";
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(tm.containsKey(ch)){
                tm.put(ch, tm.get(ch)+1);

            }else{
                tm.put(ch , 1);
            }
        }       
        revmap(tm);
    }
    
}
