
public class secondSearchTypes {
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
    public static int size; // this will be int 

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = null;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Print(){
        if(size ==0){
            System.out.println("the List is empty");
            return ;
        }
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }
                  // 1st PART 
    public int IterativeSearch(int key){ // o(n ) , as linearly traversed ans checked the index
        if(size == 0){
           
            return -1; // as the key is not present 
        }
        Node temp = head;
        int idx = 0;

        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        
        }
        return -1 ;
    }
                     // 2 Recursive Search 
    public int Helper(Node head , int key){
        if(head == tail){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = Helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;


    }
    public int  RecursiveSearch(int key){ // O(n)
        return Helper(head, key); // wahi return kr denge jo helper fxn return kar ke dega 
    }
    public static void main(String[] args) {
        secondSearchTypes ll = new secondSearchTypes();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(3); // actually this is the first element as added from first 
        ll.Print();


        System.out.println("the index of the searched elemet is :" +ll.IterativeSearch(1));       
        System.out.println("the index of the searched elemet is :" +ll.IterativeSearch(10)); 
        System.out.println("the index of the searched elemet is :" +ll.RecursiveSearch(1));  
    }
    
}
