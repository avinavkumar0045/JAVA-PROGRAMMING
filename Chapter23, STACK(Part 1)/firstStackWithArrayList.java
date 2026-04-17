import java.util.*;

public class firstStackWithArrayList {
    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>(); // STACK OF ARRAYLIST DATA TYPE
                    // OPERATION 1
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push;
        public static void push(int data){
            list.add(data);
        }

        //POP
        public static int pop(){
            if(isEmpty()){
                return -1 ; // symbolises that the stackis empty
            }
            int top = list.get( list.size()-1 );
            list.remove( list.size()-1 );
            return top;
        }

        // PEEK
        public static int peek(){
            if(isEmpty()){
                return -1 ; // symbolises that the stackis empty
            }
            return list.get(list.size()-1);
        }    
    }
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3); // first this will be printed

        while(!s.isEmpty() ){ // dekho kaise likha hai ye 
            System.out.println(s.peek());
            s.pop() ; // tabhi to check karega ki empty hua ki nahi
        }
    }
    
}
