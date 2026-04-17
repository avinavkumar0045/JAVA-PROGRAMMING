
public class first {
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
    public static void main(String[] args) {
        String words[] ={"the","a","there","their","any","thee"};

        for(int i =0; i<words.length;i++){
            insert(words[i]);

        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
        System.out.println(search("an"));


    } 
    
}
