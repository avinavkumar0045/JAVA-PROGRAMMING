import java.util.*; // DEVTA Java Collection frameWork
public class threeStackUsingJCF {
    public static void main(String[] args) {

       // Stack s = new Stack();
       Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.isEmpty());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }       
    }
    
}
