public class secondStackWithLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;            
        }
    }
        static class Stack{
            static Node head = null;
                    // ISEMPTY
            public static boolean isEmpty(){
                return head == null ;
            }
                       // PUSH
            public static void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return; // nahi likhe to run karte chala jaeiga 
                }                
                newNode.next = head;
                head = newNode;
            }   

            //  POP
            public static int pop(){
                if(isEmpty()){ // or isEmpty() 
                    return -1;

                }
                int top = head.data; // stored the top data 
                head = head.next; // replace the head 
                return top; // will return the value
            }
            //  PEAK
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
 
        public static void main(String args[]){
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
