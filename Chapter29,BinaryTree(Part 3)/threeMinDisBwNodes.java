public class threeMinDisBwNodes {
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
     // copied from last qn to find LCA
    public static Node LCA2(Node root , int n1, int n2){ // O(n)

        // base case 
        if( root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca =  LCA2(root.left , n1 , n2);
        Node rightlca = LCA2(root.right , n1 , n2);

        //leftLCA = val rightLCA = null
        if(rightlca == null){
            return leftlca;
        }

         //leftLCA = null &  rightLCA =val
         if(leftlca == null){
            return rightlca;
        }

        return root; // this is the case where dono mein hi nahi hai
    }

    public static int lcaDist(Node root , int n){  // calc dist from root to node N 
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left , n);
        int rightDist = lcaDist(root.right ,n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if( leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist +1;
        }
    }

    public static int MinDist(Node root , int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        int dist1 = lcaDist(lca , n1 );
        int dist2 = lcaDist(lca , n2); // dist between lca and node 2

        return dist1 + dist2;
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

         System.out.println(MinDist(root , 4, 7));


    }
    
}
