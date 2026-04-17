import java.util.*;
// sliding window maximum ✨✨✨✨✨✨✨✨🌟🌟🌟💫💫
  // we have an array [] od size n and  integer k .ind the maximum for each and every contigious subarray of size K.
public class thirteeenQnIMPORTANT {
    static void UsingBruteForce( int[] arr, int k ){ // O(n^2)

        int max_till_now = 0;
        int N = arr.length;

        for(int i =0; i< N - k+1; i++){ // brute force , i < size - k +1 
            for(int j =i; j<i+k; j++){
                max_till_now = Math.max(max_till_now  , arr[j]);
            }
            System.out.println(max_till_now);
        }

    }

    public static void UsingDeque(int[] arr, int k){ // har ek subarray of size K ke upar for loop chalaeinge  O(n)
        int max_till_now = 0;
        int N = arr.length;

        Deque<Integer> dq = new LinkedList<Integer>();

        for(int i =0; i<k ; ++i){
            // For every element , the previous smaller elements are useless, so remove them from queue

            while(!dq.isEmpty()
                && arr[i] >= arr[dq.peekLast()])
                // Remove from rear
                dq.removeLast();

            // Add a new element to the rear of thequeue
            dq.addLast(i);
        }
            // print the ,aximum of the window 
            System.out.println(arr[dq.peek()]+ " ");

            // Process rest of the elements 
            //  from arr[k] , arr[base+1]
            

            for(int i = k; i< N; ++i){

                while(!dq.isEmpty() && dq.peek() <= i -k)
                dq.removeFirst();

                // Remove all elements smaller
                // than the currently
                // being added element (remove useless element)
                while(!dq.isEmpty()
                && arr[i] >= arr[dq.peekLast()])
                // Remove from rear
                dq.removeLast();
                // Add current element at the rear of Q1

                dq.addLast(i);
                System.out.println(arr[dq.peek()] + " ");
            }

    }

    public static void main(String[] args) {

        int arr[] = {6,5,4,7,3,2};
        int k = 3;
        UsingBruteForce(arr, k);
        
    }
    
}
