 //AddFirst , AddLast, addMiddle, Print , Size , Remove 
public class firstAddFirst {
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
                                                //5
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
                                    //4
    public void print(){ //4 as we have the head w dont need to pass any parameter //O(n)

        if(head == null){
            System.out.println("The linked list is empty ");
            return;
        }

        Node temp = head;

        while(temp != null){ // loop temp pe chalega naa ki head par, kyu ki head will be fixed 
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
                                     // 7
    public int RemoveFirst(){ // int cause we will return the data of the Node we are removng 
        if(size == 0){
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;

        }else if(size ==1 ){
            int val  =head.data;
            head = tail = null;
            size = 0; // IMPORTANT BHUL MAT JANA , as it was one so we change it to 0
            return val;
        }

        int val = head.data;
        head = head.next; // so that head is assigned to the next Node 
        size--; // Rememeber 
        return val;

    }
                                      //8
    public int RemoveLast(){ 
        if(size == 0){
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;

        }else if(size ==1 ){
            int val  =head.data;
            head = tail = null;
            size = 0; // IMPORTANT BHUL MAT JANA , as it was one so we change it to 0
            return val;
        }

        Node prev = head; // traverse krna to head se start karnege na
        for(int i=0; i<size-2;i++){
            prev = prev.next;

        }
        int val = tail.data; // stored tail ka data before deleting or int val = prev.next.data;
        prev.next = null;
        size--;
        tail = prev ;
        size--;

        return  val;        

    }

    public static void main(String[] args) { // ye to rahe ga hi
        // Step1 , create a new node
        firstAddFirst ll = new firstAddFirst(); // the name of the file which you have created 

        ll.print();
        ll.addFirst(2); // here we had a single Node
        ll.print();
        ll.addFirst(1); // then we added a Node in front 
        ll.print();
        ll.addLast(3);  // then we added a new node in the back assigned it as new tail
        ll.print();
        ll.addLast(4);  // then again we added a new node in the back assigned it as new tail
        ll.print();
        ll.addMiddle(2,10);
        ll.print();
        System.out.println("The size of the linked list is : "+ll.size); // no size(). as it is not a method 
        System.out.println("The value of the removed head was :"+ ll.RemoveFirst());
        System.out.println("The value of removed tail was :"+ll.RemoveLast());
        ll.print();
        System.out.println("Now the size is "+ll.size);
    
    }
    
}
