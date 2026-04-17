public class threeIsASubtree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean isSubtree(Node root , Node Subroot){

        if( root == null){
            return false;
        }

        if(root.data == Subroot.data){ // agar dono identical ho gai 
            if( isIdentical( root, Subroot)){ // to check karo , identical hai ki nahi
                return true;
            }
        }

       boolean leftAns =  isSubtree(root.left, Subroot); // subtree -> true
       boolean rightAns = isSubtree(root.right , Subroot); // remember here , comparing with subroot 

       return leftAns || rightAns ;

    }

    public static boolean isIdentical( Node node , Node SubRoot){ 
        if( node == null && SubRoot == null){ // Agar dono hi null hai to return true
            return true;
        } else if( node ==  null || SubRoot == null || node.data != SubRoot.data){ // Matlab agar koi bhi ek not null hua and other is null to return false
            return false;
        }

        if( !isIdentical(node.left , SubRoot.left)){
            return false;

        }
        if( !isIdentical( node.right , SubRoot.right)){
            return false;
        }

        return true;


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

      /*   2      
         /   \    
        4     5 
      */

        Node Subroot = new Node(2);
        Subroot.left = new Node(4);
        Subroot.right = new Node(5);

        System.out.println(isSubtree ( root , Subroot));

    }
    
}
