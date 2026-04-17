public class sixDoublyLinkedList { // Also stores the data of previous node 
        public  class Node { 
            int data; // creating the two components 
            Node next;
            Node prev; /// &&&&&&&&&& 

        
    
           public Node(int data){
               this.data = data;
               this.next = null;
               this.prev = null; // &&&&&&&&&&&&&&&
           }
        }
    
        public static Node head;
        public static Node tail;
        public static int size;  

        // add first 
        public void addFirst(int data){
            // step1, create a new node
            Node newNode = new Node(data);
            size++;
    
            if(head == null){ // when no linked lists 
                head = tail = newNode ; // new node jo create kiya woho head aur tail hoga.
                return ;
            }
            // step2 , New Node's next = head
            newNode.next = head; // link i.e, new node ke next ke andar Head ka address 
            head.prev = newNode; // &&&&&&&&&&&&&&&&&&&&&& , creating  a connection with previous node 
     
            //step 3 , head = new node
           
            head = newNode;
        }

        // print first
        public void print(){ //4 as we have the head w dont need to pass any parameter //O(n)

            if(head == null){
                System.out.println("The linked list is empty ");
                return;
            }
    
            Node temp = head;
    
            while(temp != null){ // loop temp pe chalega naa ki head par, kyu ki head will be fixed 
                System.out.print(temp.data+"<->"); // &&&&&&&&&&&&&&&&&&&&&&&
                temp = temp.next;
            }
            System.out.println("null");
    
        }
           

        // remove first
        public int removefirst(){ // &&&&&&&&&&&&&&&&&&&&&&&&&&&
            if(head == null){
                System.out.println("Its an empty list");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data; // bass store kara rahe hai, maybe return karane kee liye 
            head = head.next;
            head.prev = null; // if we dont write the( size ==1) condition, this line will give error
            size--;
            return val;

        }

    
    public static void main(String args[]){
        sixDoublyLinkedList dll = new sixDoublyLinkedList();

        dll.addFirst(3); // Koi sir dard nahi , directly add ho gaya
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.print();
        System.out.println("Size is :" + dll.size);
        dll.removefirst();
        System.out.println("After removing from first : Size is "+ size);
        dll.print();




    }
}
    

