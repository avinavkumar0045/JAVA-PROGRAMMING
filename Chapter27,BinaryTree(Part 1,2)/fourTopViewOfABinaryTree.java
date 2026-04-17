 import java.util.*; // 🤯🤯🤯🤯🌟🌟🌟💫💫💫✨✨🙃🙃🙃( Logic is okay , code karne mein thoda se hai aacha)
 // first we will do here level order travrsal and take Horizontal dist.(HD) as Key for a HashMap

public class fourTopViewOfABinaryTree {
    static class Node{
        int data;
        Node right;
        Node left;

       public  Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int hd;

        public Info(Node node , int hd){
            this.node = node;
            this.hd = hd;           
        }
    }
    public static void TopView(Node root){ 
        // Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer , Node > map = new HashMap<>();

        int min =0 , max = 0; // for storing HD 
        q.add( new Info(root, 0)); // as the hd of root is always 0;
        q.add(null); // to check where our level ends

        while( !q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){

                if(q.isEmpty()){ // if the queue is over 
                    break; 
                }else{           // Level ends
                    q.add(null); 
                }
            }
            else{
                if( !map.containsKey(curr.hd)){ // means first time the Hd of a key has occured 
                   map.put(curr.hd , curr.node);
                }
                if(curr.node.left != null){
                   q.add(new Info(curr.node.left , curr.hd -1)); // so yeha pe left child ka value aur uska HD pass kiya 
                   min = Math.min(min , curr.hd -1); // yeha pe humne min ko left child ke HD  se compare kar ke update kiya ,
                  // did not compare it with max cause sense nahi banata , kyu ki max ka HD  to root ke HD se bada hi hoga 
                }
                if(curr.node.right != null){
                   q.add(new Info(curr.node.right , curr.hd + 1)); // so yeha pe left child ka value aur uska HD pass kiya 
                    max = Math.max(max , curr.hd + 1); // yeha pe humne max ko right  child ke HD se compare kar ke update kiya ,                          
                }
            }        
        }
        // Now a loop to print the top view
        for( int i = min; i<= max ; i++){
            System.out.print(map.get(i).data + " "); // printing node ka data 

        }System.out.println();
        
    }
    public static void main(String args[]){

          /*
                1
              /    \
             2      3
           /  \    /  \
         4     5  6     7    */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left  = new Node(6);
         root.right.right = new Node(7);

         TopView(root);

    }   
}
