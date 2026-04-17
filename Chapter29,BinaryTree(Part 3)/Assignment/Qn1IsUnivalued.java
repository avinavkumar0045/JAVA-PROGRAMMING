public class Qn1IsUnivalued {
    static class Node{
        int data ;
        Node right;
        Node left;

         Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean IsUnivalued(Node root , int k ){
        if(root == null){
            return true ;  // empty tree is univalued 
        }
        
        if(root.data != k){ // checking the root 
           return false;  
        }
        boolean  x = IsUnivalued(root.left , k);
        boolean y = IsUnivalued(root.right , k);
        return( x && y); // Noice logic , kin dono ko hi return kara do with && operator 

    }
    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
                
    boolean abc = IsUnivalued(root , root.data);
    System.out.println(abc);

    }  
}
