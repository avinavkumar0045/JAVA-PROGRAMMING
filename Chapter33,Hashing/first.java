import java.util.*;
public class first {
    public static void main(String[] args) {
        //create
        HashMap<String ,Integer> hm = new HashMap<>();
        hm.put("China" , 20);
        hm.put("USA",29);
        hm.put("India",4);
        hm.put("Germany",3);
        hm.put("Japan",4);

        System.out.println(hm);
        //size
        System.out.println(hm.size());
        // isempty
        System.out.println(hm.isEmpty());

        //To Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys); // not in order

        for (String k : keys){
            System.out.println("key="+k+" , value="+hm.get(k));

        }
        
    }
    
}
