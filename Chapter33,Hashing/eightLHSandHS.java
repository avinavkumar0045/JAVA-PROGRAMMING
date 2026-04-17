import java.util.*;
public class eightLHSandHS {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(333);
        hs.add(110);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(33);
        lhs.add(110);
        lhs.add(4);
        lhs.add(5);
        System.out.println(lhs); // LHS follows insertion order

        TreeSet<Integer> ths = new TreeSet<>();
        ths.add(2);
        ths.add(333);
        ths.add(110);
        ths.add(4);
        ths.add(5);
        System.out.println(ths); // TS follows asceding sorting
    }
    
}
