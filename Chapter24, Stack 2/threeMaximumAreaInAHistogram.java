import java.util.*; // 😈😈😈😈😈 dhamakedaar hai bhaai

public class threeMaximumAreaInAHistogram {
    public static  void maximumArea(int arr[]){ // O(n)
        int maxArea =0;
        int nsr[] = new int [arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // Next Smaller Right
        for(int i =arr.length-1; i>= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){ 
                nsr[i] = arr.length; // as nsr , or else we will have to do it -1 in nsl

            }else{
                nsr[i] = s.peek();

            }
            s.push(i);

        }
        // Next Smaller left
        s = new Stack<>(); // emptying the stack 

        for(int i =0; i< arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;

            }else{
                nsl[i] = s.peek();
            }
            s.push(i);

        }

        // Current Area : width = j-i-1 =  nsr[i] - nsl[i] -1
        for(int i =0; i<arr.length; i++){
            int heigth = arr[i];
            int width = nsr[i] - nsl[i] -1 ;
            int currArea = heigth * width;
            maxArea = Math.max(currArea , maxArea);
        }
        System.out.println("maximum are if the histogram is :" + maxArea);


    }
    public static void main(String args[]){
        int arr[] ={2,1,5,6,2,3};
        maximumArea( arr);

    }
    
}
