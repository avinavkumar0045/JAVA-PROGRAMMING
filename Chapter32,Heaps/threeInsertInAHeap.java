import java.util.*;
public class threeInsertInAHeap {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size() -1 ;// dist of the 
            int parent = (x -1)/2;

            while( arr.get(x) < arr.get(parent)){ //O( log n)
                // swap
                int temp = arr.get(x);
                 arr.set(x ,arr.get(parent)); // swapping child and parent when parent is smaller than child
                 arr.set(parent , temp);
                 
                 // updating , after swapping 
                 x = parent;
                 parent = (x-1) /2;
            }
        }
        // Get min 
        public int peek(){
           return  arr.get(0);       
        }

        private void Heapify(int i){ // heapify to correctly arrange the heap // tc: O(log n)
             int left = 2*i+1;
             int right = 2*i+2;
             int minIdx = i;

            if( left < arr.size() && arr.get(left) < arr.get(minIdx)){ // exchanging 
              minIdx = left;
            }
            if ( right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;          
            }
           if( minIdx != i){ 
               int temp = arr.get(i);
               arr.set(i, arr.get(minIdx));
               arr.set(minIdx , temp);

               Heapify(minIdx);       
            }
        }

        //Delete
        public int remove(){
            int data= arr.get(0);

            // Step1-swap 1st and last number
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1) );
            arr.set(arr.size()-1,temp);

            // step-2 : delete node
            arr.remove(arr.size()-1);

            //heapifi
            Heapify(0); 
            return data;

        }
        public boolean isEmpty(){
            return arr.size() == 0;   
        
        }
    }
    public static void main(String[] args) {
       Heap h = new Heap();
       h.add(3);
       h.add(2);
       h.add(4);

        while( !h.isEmpty()){ // Heap sort // tc: O( n log n)
            System.out.println(h.peek());
            h.remove();
        }      
    }
    
}
