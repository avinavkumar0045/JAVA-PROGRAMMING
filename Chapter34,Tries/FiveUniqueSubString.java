
// Given A string, return the total number of unique prefixes . IMP QUESTION 
public class FiveUniqueSubString {
    static class Node{
        Node children[] = new Node[26]; // 'a' -'z'
        boolean eow = false; // end of word 

        Node(){
         for( int i =0; i<26;i++){
            children[i] = null;
         }
        }

    }
    public static Node root =new Node();
    
    //Inserting
    public static void insert(String key){ //O(L)
        Node curr = root;
        for(int i =0; i<key.length();i++){
            int idx = key.charAt(i) -'a';
            if(curr.children[idx] == null){
               curr.children[idx] = new Node();

            }
            curr = curr.children[idx]; // so that aab uske neeche aage ke aane wale node jude 
        }
        curr.eow =true;

        
    }
    //Searching
    public static boolean search(String key){
        Node curr = root;
        for(int i =0; i<key.length();i++){
            int idx = key.charAt(i) -'a';
            if(curr.children[idx] == null){
               return false;

            }
            curr = curr.children[idx]; // so that aab uske neeche aage ke aane wale node jude 
        }
       return curr.eow == true;

    }

     
    public static int CountNodes(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for( int i =0; i<26;i++){
            if(root.children[i] != null){
               count += CountNodes(root.children[i]); // recursive fxn , ki agr root ke children null nahi hai to wapis se call kro
            }
        }
        return count+1 ; //🩷🩷💫💫✨✨count + 1, so that apni bhi node count karein ( self node) at each level
    }
    public static void main(String[] args) {
        String str ="ababa";
        int n = 5;
        // suffix -> insert in the trie 
        for( int i=0; i<str.length();i++){ // Inserting code in the trie
           String curr = str.substring(i);
            insert(curr); 
        }

        System.out.println(CountNodes(root));       
    }
    
}
