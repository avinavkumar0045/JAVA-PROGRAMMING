import java.util.*;

public class first {    
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while( !pq.isEmpty()){
            System.out.println( pq.remove());
        }
    }
}
