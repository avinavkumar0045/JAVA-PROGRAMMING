// We need to print all the nodes of the K th level 
public class firstPrintKLevelNodes {
    static  class Node{ // static is important
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static void ReturnKLevel(Node root, int level, int K){
        if(root == null){
            System.out.println("No node found ");
            return ; // if we also write here  , to print a line , it will print them when the noed goes the child of level K nodes
        }
        if(level == K){
            System.out.print(root.data+" ");
            return;
        }
        ReturnKLevel(root.left, level+1, K); // Calling for left 
        ReturnKLevel(root.right, level+1, K); // calling for right

    }
    public static void main(String[] args) {
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
         
         

         ReturnKLevel(root, 0, 2);  // level also starts from 0 , so check on 2 not 3
        
    }
    
}
