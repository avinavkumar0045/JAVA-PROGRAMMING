public class fivePalindrome {
    
        public class Node{
            int  data;
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

         // Slow fast approch  , step 1
         public Node  MidNode(Node head ){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next; // +1
                fast = fast.next.next; // +2

            }
            return slow; // mid node 
         }
        
        public boolean Palindrome(){
            if(head == null || head.next == null){
                return true;
            }
            // step 1 , find mid
            Node midNode = MidNode(head);

            // step2 reverse 2nd half 
                       // reverse 2nd half  , 3 variable 4 step method 
            Node prev = null;
            Node curr = tail = midNode;
            Node next;
            

           // step3 -> check left and right half 
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            
            }
           Node right = prev; // rigth half head  , kyu ki previous is the head of 2nd half after reversing 
           Node left = head; // actual head , means from the original list , which at posn 1

           // step 3 , compare 1 and 2nd half 
           while(right != null){
            if(left.data != right.data){
                return false;

            }
            left = left.next;
            right = right.next;

           }
           return true;

        }

    public static void main(String[] args) {
        fivePalindrome ll = new fivePalindrome();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        System.out.println("the current linked list is :");
        ll.Print();
        System.out.println(ll.Palindrome());
    }
    
}
