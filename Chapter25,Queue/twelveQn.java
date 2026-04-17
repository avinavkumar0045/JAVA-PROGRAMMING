// REVERSE THE FIRST K ELEMENTS OF THE QUEUE
import java.util.*;
public class twelveQn {

    public static void ReverseFirstKelements(Queue<Integer> q , int K){
        if(q.isEmpty() == true || K > q.size() ){
            return;
       
        }if(K <= 0){
            return ;
        }

        Stack<Integer> S  = new Stack <Integer>();

        // Push first  K elements in the stack
        for(int i =0; i< K; i++){
            S.push(q.peek());
            q.remove();
        }

        // Enque the  contents of the stack
        // at the back of the queue

        while(S.empty()){
            q.add(S.peek());
            S.pop();
        }

        // Remove the remaining elements and enqueue
        // then at the end of the queue
        for(int i =0; i<q.size() - K;i++){
            q.add(q.peek());
            q.remove();

        }

    }

    // using recursion logic(Optional)
    static void reverseFirstKelementsUsingRecursion(Queue<Integer> queue , int k){
        helper(queue , k);
        int sz = queue.size();
        while( sz --> 0){
           int x =  queue.poll(); // poll means remove
           queue.add(x);
        }
    }

    static void helper(Queue<Integer> queue , int k){
        if( k ==0) return;
        int front = queue.poll(); // poll is used caus , if queue is empty and we use remove , it will give error
        helper(queue, k-1);
        queue.add(front);
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int K = 5;
        ReverseFirstKelements(q, K);


    }
    
}
