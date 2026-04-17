import java.util.*;
public class first {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{ 

        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){ // if -1, no need to create new node
                return null;
            }

            Node newNode = new Node(nodes[idx]); // if not -1, need to create new node
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder traversal = root -> left subtree -> rigth subtree.
        public static void Preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
        
        // Inorder traversal = left subtree-> root -> right Subtree.
        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data +" ");
            Inorder(root.right);          
        }

        // PostOrder traversal = left-> right -> root
        public static void PostOrder(Node root){
            if(root == null){
                return ;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        // LEETCODE 102 Level ordr traversal
        // level Order Traversal -> 1,2,3,4,5,6    16/02/2025 // Space O( log n to the base 2 )
        public static void LevelOrder(Node root){ // O(2n) = O(n) 
            if(root == null){
               return ;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root); 
            q.add(null) ; // for next line after each level

            while( !q.isEmpty() ){ // q mein add kiya aur fir unhein nikal ke print kara denge  , !q.isEmpty()

                Node currNode = q.remove(); // matlab jo upar mein add kiya hai na , root ya null , wahi yeha pe currNode bann rahe hai
                if(currNode == null){

                    System.out.println(); 
                    if(q.isEmpty()){ // if now there are no elemen to process
                        break;
                    }else{
                        q.add(null); // nahi to isko wapis daal diya after next line it will help
                    }

                }else{ // if instead of null node other node comes out

                    System.out.print(currNode.data+ " "); 
                    if(currNode.left != null){ // if left child is not null
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){ // if right child is not null
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree(); // object creation 
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
        System.out.println("Printing preorder for thr tree");
        tree.Preorder(root);

        System.out.println();

        System.out.println("Printing by Inorder traversal method ");
        tree.Inorder(root);

        System.out.println();
        System.out.println("Printing by PostOrder traversal");
        tree.PostOrder(root);

        System.out.println();
        System.out.println("Printing by Level Order");
        tree.LevelOrder(root);
    }
    
}


