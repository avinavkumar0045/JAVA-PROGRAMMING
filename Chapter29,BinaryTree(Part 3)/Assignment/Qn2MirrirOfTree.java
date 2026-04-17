

public class Qn2MirrirOfTree {
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

        public static boolean AreMirror(Node root , Node root1){
            if(root == null || root1 == null){
                return true;
            }
           if(root.data != root1.data){
             return false;
           }
           AreMirror(root.right , root1.right);
           AreMirror(root.left , root1.left);

           return true;          
        }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(3);
        root1.left.left = new Node(7);
        root1.left.right = new Node(6);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        System.out.print(AreMirror(root , root1));




        

        
    }
    
}
