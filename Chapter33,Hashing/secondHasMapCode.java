import java.util.*; // ✨🩷🩷 IMPLIMENTATION FROM INTERVIEW POINT OF VIEW 

public class secondHasMapCode { 
    static class HashMap<K,V>{ // generic 
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N ;
        private LinkedList<Node> buckets[]; // N= buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N= 4;
            this.buckets = new LinkedList[4]; // that warnning was , cuz here we aew not defining the type of LL , so we suppressed the warning
            for(int i =0; i<4;i++){
                this.buckets[i] = new LinkedList<>(); // initializing with empty linked list on each index of array 
            }

        }

        // till this we were provided with the code , now we will write for the functions
        //1️⃣
        public void put(K key , V value){ // O(1)
            int bi = hashFunction(key); // 0 to size-1  1️⃣🅰️
            int di = SearchINLL(key , bi); // either return valid or -1 1️⃣🅱️

            if( di != -1){
                Node node = buckets[bi].get(di);
                node.value =value; // added a node as there was no node
            }else{
                buckets[bi].add(new Node(key , value));
                n++;
            }
            double lamda = n/N;
            if( lamda > 2.0){ // here 2.0 is the threshold value for rehasing 
                rehash(); // 1️⃣C


            }
        }
        // Hash Function to find the bucket index 1️⃣🅰️
        private  int hashFunction( K key){
            int hc = key.hashCode(); // could return anything 4324, -3434
             return  Math.abs(hc) % N; // size is the size if bucket , here4 , so it will always return b/w 0 to 3

        }
        // to find the data index in the LL , within the bucket
        private int SearchINLL(K key , int bi){ // 1️⃣🅱️
            LinkedList<Node> ll = buckets[bi];
            int di=0;

            for( int i =0; i<ll.size() ;i++){
              Node node = ll.get(i);
              if( node.key == key){
                return di;
              }
              di++;
            }
            return -1; // if we dont get key in that list 
        }

        @SuppressWarnings("unchecked")
        private void rehash(){ // 1️⃣C 
            LinkedList<Node> oldBuck[]= buckets;
            buckets = new LinkedList[N * 2];
            N= 2* N;
            for( int i =0; i< buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in new bucket 
            for( int i =0; i<oldBuck.length ;i++){
                LinkedList<Node>ll = oldBuck[i];
                for( int j =0; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key , node.value);
                }
            }
        }
       // 2️⃣
        public boolean containsKey(K key){ // O(1)
            int bi = hashFunction(key);
            int di = SearchINLL(key, bi);

            if(di != -1){ // valid 
                return true;
            }else{
                return false;
            }
        }

        //3️⃣
        public V remove(K key){ //O(1)
            int bi = hashFunction(key); // 0 to size-1  
            int di = SearchINLL(key , bi); // either return valid or -1 

            if( di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value; // added a node as there was no node
            }else{
                return null;
            }
        }

        // 4️⃣
        public V get(K key){ //O(1)
            int bi = hashFunction(key); // 0 to size-1  
            int di = SearchINLL(key , bi); // either return valid or -1 

            if( di != -1){
                Node node = buckets[bi].get(di);
                return node.value; 
            }else{
               return null;
            }
        }
        // 5️⃣
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i =0; i< buckets.length;i++){
                LinkedList<Node>ll = buckets[i];
                for( Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return (n == 0);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("Nepal",10);
        hm.put("Pakistan",35);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println("The value of India is : "+hm.get("India"));
        System.out.println( "Value with key removed "+ hm.remove("India"));
        System.out.println(hm.get("India"));

    }    
}
