

public class SixLongestWordWithAllprefixes {
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
      
    public static String ans= "";

    public static void LongestWord(Node root , StringBuilder temp){ // StringBUilder cause , it does the job , as many changes will be performed on the temp string
        if( root == null){
            return ;
        }
        
        for( int i =0 ; i< 26;i++){
            if( root.children[i] != null && root.children[i].eow == true){
                char ch= (char)( i+'a');
                temp.append(ch);
                if( temp.length() > ans.length()){
                    ans = temp.toString(); // cant assign directly into string
                }
                
                LongestWord(root.children[i], temp); 
                temp.deleteCharAt(temp.length()-1);// bracktracking , deleting last entered charcter 
            }
        }
    }
    public static void main(String[] args) {
        String words[] ={"a","banana","app","appl","apple","apply","ap"};

        for( int i=0; i<words.length;i++){ // Inserting code in the trie
            String curr = words[i];
             insert(curr); 
        }
        LongestWord(root, new StringBuilder(" ")); // gave a empty StringBuilder 
        System.out.println(ans);
    }
    
}
