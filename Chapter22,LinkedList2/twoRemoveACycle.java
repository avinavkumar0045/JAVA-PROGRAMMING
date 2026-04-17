

public class twoRemoveACycle {
    public static class Node { // 1
        int data; // creating the two components 
        Node next;

       public Node(int data){
           this.data = data;
           this.next = null;
       }
    }

    public static Node head;
    public static Node tail;
    public static int size;           // 6
                                      // 2
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

        //step 3 , head = new node
        head = newNode;
    }
                                    // 3
    public void addLast(int data){ 
        // step1 , create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step2 , tail.next = newNode
        tail.next = newNode; // phele tail ke next ko NewNOde se connect kr diya 

        // step3 , tail = newNode
        tail = newNode; // aab newNode ko tail kr diya 
    }

    public static boolean isCycle(){ // Floyd's Cycle Finding Algorithm
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next; // +1
        fast = fast.next.next; // +2
        if(slow == fast){
            return true;
        }
    }

    return false; // cycle exist 
    } 

               // REMOVE CYCLE
    public static void removeCycle(){
        // 1.detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
               cycle = true;
               break;
            }
        }
        if(cycle == false ){
            return ;
        }
        //2 find meeting point  //REMEMBER 🩷🩷(HOW TO FIND THE CYCLE POINT)
        slow = head ;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast; 
            fast = fast.next;
        }
        // 3remove cycle -> last.next = null
        prev.next = null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);  // kyu ki 3 ke node mein slow and fast are meeting at 1st node , so it's a corner case
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next  = temp;
        
        // 1->2->3->2 
         
        System.out.println(isCycle()); // phele check karo 
        removeCycle();// remmove karo
        System.out.println(isCycle()); // fir check karo

        
    }  
}
