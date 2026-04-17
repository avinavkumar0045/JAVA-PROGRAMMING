public class try {
    public class Node{
        int val ;
        Node next;

        public Node(int val){
            this.val = val;
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
}
