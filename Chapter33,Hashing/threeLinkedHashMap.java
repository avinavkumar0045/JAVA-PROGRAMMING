import java.util.*;
public class threeLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(); // ORDER SAME AS INPUT 
        lhm.put("India",150);
        lhm.put("China",130);
        lhm.put("USA",50);
        lhm.put("Mexico",400);

        HashMap<String,Integer> hm = new HashMap<>(); // UNORDERED
        hm.put("India",150);
        hm.put("China",130);
        hm.put("USA",50);
        hm.put("Mexico",400);

        System.out.println(lhm);
        System.out.println(hm);
        
        // Tree HashMap
        TreeMap<String,Integer> thm = new TreeMap<>(); // KEYS ARE SORTED 
        thm.put("India",150);
        thm.put("China",130);
        thm.put("USA",50);
        thm.put("Mexico",400);
         
        System.out.println(thm);

    }
    
}
