import java.util.*; //🩷🩷🩷 remmember this 
public class eightNextGreaterElement { // with help of stack O(n)
   
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        int arr[] = { 6,8,0,1,3};
        int nextGreater[] = new int[arr.length];

        for(int i =arr.length-1 ; i>= 0; i--){ // humm peeche se traverse karnege 
            // while
            while( !S.isEmpty() && arr[S.peek()] <= arr[i]){ // WE are dealing in the address not  the value 
                S.pop();
            }
            // if else
            if(S.isEmpty()){ // empty stack case 
                nextGreater[i] = -1; // e.g, for the last case it will always be empty , and other cases also
                
            }else{
                nextGreater[i] = arr[S.peek()];
               
            } 
            // push in S
            S.push(i); // &&&&&&&&&&& we are traking in terms of index , so we are pushing the index number  
        }

        for(int i =0; i<arr.length;i++){
            System.out.println(nextGreater[i]);
        }       
    }
}
// Similarily next greater left , just start the loop from the front 
// Similariily , next smaller ,just change the {[S.peek()] >= arr[i])} condition
// Sililarily , next smaller left , 
