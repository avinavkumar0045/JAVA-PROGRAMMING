

public class fourRemoveNthNodeFromLast {

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

    public void RemoveFromBack(int n){
        // calculate size
        int sz=0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == size ){ //size - n +1;
            head = head.next; // matlab head ko hi hatana hai 
            return;

        }

        //sz-n
        int i =0;
        int iTOFind = sz -n;
        Node prev = head;
        while(i < iTOFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    
    }
    public static void main(String[] args) {

        fourRemoveNthNodeFromLast ll = new fourRemoveNthNodeFromLast();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(5);
        ll.AddFirst(6);
        ll.AddFirst(7);
        System.out.println("the current linked list is :");
        ll.Print();
        System.out.println("the Linked List after deleting node is ");
        ll. RemoveFromBack(3);

        ll.Print();




        
    }
    
}
