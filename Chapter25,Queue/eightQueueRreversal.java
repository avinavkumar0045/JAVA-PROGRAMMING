import java.util.*; // 😎😎😎😎😎
public class eightQueueRreversal { // EASY USE STACK FOR THIS 
    public static void Reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i =0; i<size ; i++){
           
            s.push(q.remove());
        }
        while(!s.isEmpty()){
          
           q.add( s.pop() );

        }
    }


    public static void main(String args[]){ // O(n)
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Reverse(q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
    
}
