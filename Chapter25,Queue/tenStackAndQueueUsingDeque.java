import java.util.*;
public class tenStackAndQueueUsingDeque {

    static  class Stack{ // creating stack with the help of deque
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);

            
        }
        public int pop(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }

    static class Queue{ // Using dequeue to impliment Queue
        Deque<Integer> dq1 = new LinkedList<>();

        public void add(int data){
            dq1.addLast(data);
        }
        public int remove(){
            return dq1.removeFirst();
        }

        public int peek(){
            return dq1.getFirst();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       
        System.out.println("Peek is equal to "+ s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop()); // Popped all , so no elements in it 

        // for queue 
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek == "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


    }
    
}
