public class threeReverseALinkedList {
   
        public class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;

            }
        }
        public static Node head;
        public static Node tail;
        public static int size;

        public void AddFirst(int data){
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = null;
          
            }
            newNode.next = head;
            head = newNode;
        }

        public void Print(){
            if(size == 0){
                System.out.println("the Linked list is empty");
                return ;
            }
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
            System.out.println("null");
           
        }

        public void ReverseList(){  // O(n) , 3 variable 4  steps 
            Node prev = null; // nothing before head , so null right now
            Node curr = tail = head ; // as we have assumed curr = head and after reverse it will become tail
            // assignment in java is from right to left ,so remember that , right ki value tail mein and tail ki value curr mein 
            Node  next;
            while(curr != null){ // these all will be in order 
                 next = curr.next; // its like taking backup for the the aage wale terms nahi to prev ko point krtw hi, ye sab gaayd ho jeiga 
                 curr.next = prev;
                 prev =curr;
                 curr = next ;  // aab aage ja ke same thing repeat hoga to ,         

            }
            head = prev; // as curr becomes null so previous is assignend as head , kyu ki previous is before curr
        }
        public static void main(String[] args) {
            threeReverseALinkedList ll = new threeReverseALinkedList();
            ll.AddFirst(1);
            ll.AddFirst(2);
            ll.AddFirst(3);
            ll.AddFirst(4);
            ll.AddFirst(5);
            ll.AddFirst(6);
            ll.AddFirst(7);
            System.out.println("the current linked list is :");
            ll.Print();
          
            System.out.println("the reversed linked list is :");
            ll.ReverseList();
            ll.Print();
        }
    
}
