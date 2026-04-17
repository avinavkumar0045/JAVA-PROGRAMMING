public class Qn3DeleteNodewithvalueK { // delete the leaf nodes with K values
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
    

    public static Node Removek(Node root , int k){
        if(root == null){
            return null;
        }

        if(root.data == k && root.right == null && root.left == null){
           root = null;
           
        }
        Removek(root.right , k);
        Removek(root.left , k);

        return root;

    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        System.out.print(Removek(root ,3 ) +" ");
        

    }
    
}
