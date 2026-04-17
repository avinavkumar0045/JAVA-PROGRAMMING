public class fiveZigZag {
    
        public  class Node { 
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
        public void AddFirst(int data){
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
                                        
        public void AddLast(int data){ 
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
                AddFirst(data); // ye ha pe hum size++ nahi karenge cause we are calling the addFirst method where we have already written the size++ line.
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

        // Actually writing from here 

        public void ZigZag(){
            // find mid
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }
            Node mid = slow;

            // reverse 2nd half
            Node curr = mid.next; // 3 variable and 4 steps
            mid.next = null;
            Node prev = null;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev =  curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL, nextR;
            // alternate merge , zig zag merge 
            while(left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left  = nextL;
                right = nextR;
            }
        }

        public static void main(String[] args) {
            fiveZigZag ll  = new fiveZigZag ();
            ll.AddLast(1);
            ll.AddLast(2);
            ll.AddLast(3);
            ll.AddLast(4);
            ll.AddLast(5);
            ll.AddLast(6);
            ll.AddLast(7);
            ll.print();
            System.out.println("after zigzag");
            ll.ZigZag();
            ll.print();
        }
}
    

