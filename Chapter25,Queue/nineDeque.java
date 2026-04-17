import java.util.*;
public class nineDeque { // Deque -> Double ended Queue
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq);
        dq.removeFirst(); // Even if you write just remove , it will remove from front 
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

        System.out.println("the first element is : "+ dq.getFirst());
        System.out.println("the last element is : "+ dq.getLast());

    }
    
}
