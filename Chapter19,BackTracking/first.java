/*sabse phele we have to make an array with value of size, 5, 
   and then while back tracking we have to reduce each value by 2 */

public class first { // by bit going up and comming down O(N) , TIME COMPLEXITY IS USED , space complexit  =o(N)
    public static void method(int arr[], int idx, int val){
        // Base Case
        if(idx == arr.length){
           print(arr);
           return ;
        }
        // kaam
        arr[idx] = val;
        method(arr, idx+1, val+1); // fxn call step
        // Back tracking step always after function call
        arr[idx] = arr[idx] -2; // backtracking step  , iske baad call the print fxn.
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" , ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        method(arr, 0,1);
        print( arr); //back tracking to ho gaya , now call print fxn then only we can message 

    }
    
}
