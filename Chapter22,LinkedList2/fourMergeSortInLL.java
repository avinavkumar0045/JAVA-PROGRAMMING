public class fourMergeSortInLL { // O(n log n)
    
    public static class Node { 
        int data; // creating the two components 
        Node next;

       public Node(int data){
           this.data = data;
           this.next = null;
       }
    }
    public static Node head;
    public static Node tail;
    public static int size;           
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
    public void addMiddle(int idx, int data){ 

        if(idx == 0){ // we are doing this seperately cause , we will have to assign it as head also.
            addFirst(data); // ye ha pe hum size++ nahi karenge cause we are calling the addFirst method where we have already written the size++ line.
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head; // head se traverse krna start karenge 
        int i=0;

        while( i < idx -1){
            temp =temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next; // here we assigned 1st ka next will be newNode 
        temp.next = newNode; // here we assigned the value to the new node
    }

    public void print(){ //4 as we have the head w dont need to pass any parameter //O(n)

        if(head == null){
            System.out.println("The linked list is empty ");
            return;
        }

        Node temp1 = head;

        while(temp1 != null){ // loop temp pe chalega naa ki head par, kyu ki head will be fixed 
            System.out.print(temp1.data+"->");
            temp1 = temp1.next;
        }
        System.out.println("null");
    }
             // ACTUALLY Started coding from here in this code
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head ;
        }
        // find mid 
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft , newRight);
    }

    public  Node getMid(Node head){
        Node slow = head; 
        Node fast = head.next; // Important , rember for even linked lizt 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid node 
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
           if(head1.data <= head2.data){
            temp.next = head1; // temp jo aiwaye hi tha , usko 3 ke taraf point kara diye
            head1 = head1.next; // 3 ko 5 ki taraf
            temp = temp.next;  // temp ko aage badha diye 

           }else{ // head1.data >= head2.data
            temp.next = head2; 
            head2 = head2.next; 
            temp = temp.next;            
           }
        }
        
        while(head1 != null){
            temp.next = head1; 
            head1 = head1.next; 
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2; 
            head2 = head2.next; 
            temp = temp.next; 
        }      
        return mergedLL.next;
    }
    public static void main(String[] args) {
        fourMergeSortInLL ll = new fourMergeSortInLL ();
        // add
        ll.addFirst(1); // Koi sir dard nahi , directly add ho gaya
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.addFirst(11);
        System.out.println("Before Sorting");
        ll.print();
        ll.head =  ll.mergeSort(ll.head);
        System.out.println("After Sorting");
        ll.print();
    }  
}
