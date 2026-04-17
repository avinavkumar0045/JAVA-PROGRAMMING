import java.util.*;
public class sevenIteratorInHS {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        // Using Iterator     
       Iterator it = hs.iterator();  
        while (it.hasNext()) { 
            System.out.println(it.next());
            
        }

        // Using Advanced Loop
        for(Integer num : hs){
            System.out.println(num);
        }
    }
      
}
