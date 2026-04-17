import java.util.*;
public class sixHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // As Set only unique elements 

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.remove(2);
        

        System.out.println(hs);
        System.out.println("the size of the set is :" +hs.size());
        //  hs.clear();
        System.out.println(hs.isEmpty());

    }
    
}
