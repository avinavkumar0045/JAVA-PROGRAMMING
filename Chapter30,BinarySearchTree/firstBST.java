import java.util.*;
public class firstBST {
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

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            root.left  = insert(root.left, val);
        }
        if(  val > root.data ){
            root.right = insert(root.right , val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // To search whether a key is present in a BST or not 2️⃣
    
    public static boolean Search(Node root , int key){ //O(H)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return Search(root.left , key );

        }
        else{           // bhai else lkhne pe neeche return statement maang hi nahi raha hai, Khatarnak
            return Search(root.right , key);
        }
       
    }
    // 3A Inorder Succesor 

    public static Node InorderSuccesor(Node root){
       while(root.left != null){
        root = root.left ;
       }
       return root;
    }

    // 3️⃣ TO delete a node from a TreeTree
    public static Node Delete(Node root , int D){
        if(root.data < D){
            root.right = Delete(root.right , D);
        }
        if(root.data > D){
            root.left =  Delete(root.left ,D);
        }
        else{ // voila casse
            // case-1= leaf node 
            if(root.left == null && root.right == null){
                return null; // attached null to above parent 
            }

            // case-2 = One child
            if(root.left == null ){
                return root.right; // beech  wala khud hi delete ho jaeiga , uske jagah uska existing child aa jaeiga 
            }else if(root.right == null){
                return root.left;
            }

            // case 3 - both child are present 
            Node IS = InorderSuccesor(root.right); // we will create a fxn 

            root.data  = IS.data; // replaced the particular node with the inorder succesor
           root.right =  Delete(root.right , IS.data) ; // this is to delete the inorder succesor from the right subtree
        }
           return root;        
    }

    // 4️⃣ To print in range 
    public static void toprintInRange(Node root ,int k1, int k2){

        if(root == null){
            return ;
        }
        if( root.data >= k1  && root.data <= k2 ){
            toprintInRange(root.left , k1, k2);
            System.out.print(root.data +" ");
            toprintInRange(root.right , k1, k2);
        }
        else if(root.data < k1 ){
            toprintInRange(root.left , k1 , k2);
        }else {
            toprintInRange(root.right, k1,k2);
        }
    }

    // 5A creating PrintPath fxn

    public static void PrintPath(ArrayList<Integer> path){
        int n = path.size();
        for(int i =0; i<n; i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }

    // 5️⃣ To print all the paths from root to leaf
    public static void PrintRoot2Leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.right == null && root.left == null){
            PrintPath(path);
        }
        
        PrintRoot2Leaf(root.left , path);
        PrintRoot2Leaf(root.right, path);
        path.remove(path.size()-1) ; // last wala delete karo tabhi to koi aur rasta pe jaoge , ya wwapis aaoge 
    }

    // 6️⃣ ISValid BST ? // ye galat ans de raha hai for {1,1,1 }BST  🌟🌟🌟🌟🌟🌟
    public static boolean IsValidBST(Node root , Node min , Node max){ // all 3 are nodes 
        if(root == null){
            return true; // as the null BST will always be a true matrix
        }
        if( min != null && root.data <= min.data ){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return IsValidBST(root.left , min , root )
                 && IsValidBST(root.right , root , max);


    }
    // 7️⃣ TO print the mirror of the given BST

    public static Node  MirrorTree(Node root){ //O(n)
        if(root == null){
            return null ;
        }

        Node left = MirrorTree(root.left); // left subtree Mirror image
        Node right = MirrorTree(root.right);

       
        root.left = right;
        root.right = left;

        return root;
    }
    public static void preorder(Node root){ // To print and check the mirror of BST
        if(root == null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
       
        preorder(root.right);
    }

    public static void main(String[] args) { //MAIN FXN
        int values[] = {1,2,3}; //8,5,3,1,4,6,10,11,14
        Node root = null;

        for(int i=0; i<values.length;i++){
            root = insert(root , values[i]);
        }

        inorder(root); // to check whether the root is correct or not , as it will be in ascending order 
        System.out.println();
       int key = 8;
        System.out.println("Is "+ key+" present in the BST ?");//2️⃣
        if(Search(root , key)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        } 

       /*  root = Delete(root,1); // deleting the node 3️⃣
        System.out.println();

        inorder(root); // Now to print the node 
        System.out.println(); */

        toprintInRange(root, 5, 12);
        System.out.println();

        // 5️⃣
        PrintRoot2Leaf(root, new ArrayList<>());

      //  6️⃣
      if(IsValidBST(root, null,null)){ // null cause , 0 cant be node 
        System.out.println("This is a valid BST");

      }else{
        System.out.println("Is not a valid BST");
      }

      // 7️⃣ to print and check
      root = MirrorTree(root);
      preorder(root);
          
    }   
}
