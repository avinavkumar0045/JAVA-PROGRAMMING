//WORD BREAK PROBLEM 

public class twoWordBreakProblem {
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

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for( int i =1; i<= key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] ={"i","like","sam","samsung","mobile","ice"};

        for(int i =0; i<words.length;i++){
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));


    } 
}
