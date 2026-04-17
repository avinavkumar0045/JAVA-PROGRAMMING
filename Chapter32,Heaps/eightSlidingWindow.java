
import java.util.PriorityQueue;
public class eightSlidingWindow {

    static class pair implements Comparable<pair>{
        int val;
        int idx;

        pair( int val , int idx){
            this.idx = idx;
            this.val = val;
        }
        @Override
        public int compareTo(pair p2){
           // aascending  return this.val- p2.val; 
           // for descending
           return p2.val - this.val;
        }  
    }
    public static void main(String[] args) {
        int arr[] = { 1,3,-1,-3,5,3,6,7};
        int k =3;
        int res[] = new int[arr.length - k +1 ]; // result aray size
        PriorityQueue<pair> pq = new PriorityQueue<>();

        for( int i =0; i<k;i++){ // 0 to 2 tak to yehi add kr liya , noice thought 
            pq.add( new pair(arr[i], i));
        }
        res[0] = pq.peek().val; // aab ek ek kr ke dekheneg 
        for( int i=k; i< arr.length ;i++){

          while( pq.size() > 0 && pq.peek().idx <= (i-k)){
            pq.remove();
          }

          pq.add( new pair(arr[i] , i));p
          res[ i -k+1 ] = pq.peek().val; // result array 

        }
        for( int i =0; i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    
}
