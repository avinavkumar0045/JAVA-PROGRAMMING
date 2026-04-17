

public class Qn5MaxSum {
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

    public static void MaxSum(Node root , int sum){
        if(root == null){
            return ;
        }
        
        if(root.data > 0){
            sum += root.data;

        } 
        MaxSum(root.right , sum);
        MaxSum(root.left , sum );

        
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        
        int sum =0;
        MaxSum(root , sum);
    
        System.out.println(sum);
        
    }
    
}
