public class secondQueueUsingLL {

    static class Node{
        int data;
        Node next;
        Node(int data){ // constructor
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return (head ==  null && tail == null);
        }
        // Add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return ; 
            }
            tail.next = newNode; // here linked to the next node
            tail = newNode; // here assigned the posn of tail to next
        }

        public static int Remove(){
            if(isEmpty()){
                System.out.println("The LL is empty");
                return -1;
            }
            int front = head.data;
            // single element
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front ;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(); // n = size;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Remove();
        }
    }
    
}
