
public class twoHeightOfTree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;

        }
    }        
        // Calculating the heigth of the tree
        public static int Height(Node root){
            if(root == null){
                return 0;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);

            return Math.max(lh,rh) +1 ; // in terms of nodes
        }
        
        // Total  count of nodes in a tree
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int  lcount = count(root.left); // recursion
            int rcount = count(root.right); // recursion
            return (lcount + rcount +1); // har recursion mein yeha tak aayenge and "+1 " se count++ hote jaeiga 
        }
    
        public static int SumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = SumOfNodes(root.left);
            int rightSum = SumOfNodes(root.right);
            return (leftSum + rightSum + root.data) ; // har recursion mein yeha tak aayeinge and root.data se uss particular node ka value utayenge 

        }
             // Part 2 starts
        // Dimater of the tree
        public static int Diameter(Node root){ // (n^2) , kyu ki har node pe jaa ke height aur diameter calculate kar rahe hai, O(N) * N 
            if(root == null){
                return 0;

            }
            int leftDiam = Diameter(root.left);
            int lh = Height(root.left); // Using the Height function , cause height is reqd. here 

            int rightDiam = Diameter(root.right);
            int rh = Height(root.right);

            int selfDiam = lh + rh +1;
            
            return Math.max(Math.max(leftDiam , rightDiam ) , selfDiam); // ek baar mein sayad 2 ko hi comapre kar sakte hai, but jugad
        }

        // 2nd and efficient method for knowing diameter 

        static class Info{
            int diam;
            int ht;

            public Info(int diam , int ht){
                this.diam = diam;
                this.ht = ht;
            }
        } 
        // comparably easy way to find dimater , calc dimater and height's simultaneously .
        public static Info Diameter2(Node root){ // O(n)

            if(root == null){
                return new Info(0,0);
            }

            Info leftInfo = Diameter2( root.left);
            Info rightInfo = Diameter2(root.right);

            int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam ), leftInfo.ht + rightInfo.ht +1);
            int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

            return new Info( diam , ht);



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

      
        System.out.println("the maximum height of the tree is :"+ Height(root) );
        System.out.println("the total count of nodes in the tree is : "+ count(root));
        System.out.println("The total sum of all nodes is :"+ SumOfNodes(root));
        System.out.println("The diameter of the Tree is : "+ Diameter(root));
        //by using 2nd method of diamteter calculation
        System.out.println("The actual diameter of the Tree is : "+ Diameter2(root).diam);                                                      ;

        
    }
    
}
