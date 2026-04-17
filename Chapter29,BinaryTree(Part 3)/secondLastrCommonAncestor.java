import java.util.*;

public class secondLastrCommonAncestor {
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

    public static boolean getPath(Node root , int n , ArrayList<Node> path){

        if(root == null){
            return false;
        }

        path.add(root);

       if(root.data == n){
        return true;

       }
       boolean foundLeft = getPath(root.left , n , path );
       boolean foundRight = getPath(root.right ,n, path);

       if(foundLeft || foundRight){
        return true;

       }
       path.remove(path.size() -1 );
       return false;

    }

    public static Node LCA(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>(); // to store path of 1st node
        ArrayList<Node> path2 = new ArrayList<>(); // to store path of 2nd node 

        getPath(root , n1, path1);
        getPath(root, n2 , path2);

        // last common Ancester
        int i =0;
        for( ;  i<path1.size() && i<path2.size() ; i++){

            if(path1.get(i) != path2.get(i)){ // last will be the parent which is common , kyu ki we have to find he lowest common ,
                break;                         // so ekdem upar se suru kiya hai
            }          
        }
         // last equal node -> ith 
         Node lca = path1.get(i-1);
         return lca;
    }


    // Approch 2 
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

         int n1 = 4, n2 =7;

         System.out.println(LCA(root , n1, n2).data); // Humen node ke data ko print karana hai
    }
    
}
