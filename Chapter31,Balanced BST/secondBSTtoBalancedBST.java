import java.util.*; // The idea is going to be , is to convert the give BSt to inorder array and perform the last question method
public class secondBSTtoBalancedBST {
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

    // Inorder sequence will be a sorted list // 1A
    public static void inorderArray(Node root , ArrayList<Integer> inorder ){ 
      // converting the given BSt to inorder array to make it sorted , Madam ne neeche se ki arguments mein call kr liye hai ,ArrayList ko
        if(root == null){
            return ;
        }
        inorderArray(root.left , inorder); 
        inorder.add(root.data);
        inorderArray(root.right , inorder );    
    }
    // 1
    public static Node BalancedBST(Node root){
        // inorder seq // 1A
        ArrayList<Integer> inorder= new ArrayList<>();
        inorderArray(root ,inorder );  // TO BHAIYA YEHA SE TO MIL GAYA , SORTED ARRAY, AAB AAGE KA CHAP DO LAST LECTURE SE 
       
        // 1B 
        // sorted inorder ->  balanced BST
        root = createBST(inorder , 0 , inorder.size() -1);
        return root; // ye root aab main fxn mein jaeiga 
    }

   
    // ==  ==  ==   ==  ==   ==  ==  ==  ==  == == ==   ===    === ==== ==== === === === === === === ==   == ==  ==  ==  === ===   ==
                         // Copied logic from last , question
    public static void preorder(Node root){  // print ke liye
        if( root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){

        if(st > end){
            return null;   
        }
        int mid = (st+end )/2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st,mid-1);
        root.right = createBST( arr, mid+1, end);

        return root;
    }
    public static void main(String args[]){

            /* given BST
                8
              /    \
             6      10
           /          \
          5            11
        /                 \
       3                    12    */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList<Integer> inorder= new ArrayList<>();

       
             /* final required BST 
                8
              /    \
             5      11
           /  \    /  \
         3     6  10    12   */

        
         root = BalancedBST(root); // stored the balanced BST in the original root 
         preorder(root); // printed to check
    
    }
}
