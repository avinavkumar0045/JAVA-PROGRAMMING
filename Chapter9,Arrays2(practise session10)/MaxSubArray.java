// Kardeins theorem
public class MaxSubArray { // Ek ek kr ke saare pair of numbers ka sum nikalo
    
    public static int MaxSubArray(int numbers[]){  // Optimised approch is prefix sum approch, done in next file
        int n = numbers.length;
        int currSum =0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){  // i =start     // time complexity O(n^3)
            for(int j=i;j<n;j++){ // j = end
                currSum =0;
                for(int k=i;k<=j;k++){ // k from start to end , // this is to print
                    currSum += numbers[k]; // SubArray Sum
                }
                System.out.println(currSum);
                if(MaxSum < currSum){
                    MaxSum = currSum;
                }
               
            }
            System.out.println();
        }
        System.out.println("Maximum sum is :"+ MaxSum);
        return MaxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {  1, -2, 6,-1,3};
        MaxSubArray(numbers);
    }
    
} 
/* CAN DO MaxSubSumArray by this also
int a [] = { 1,2,3,-4,5};
int ans =0; // if saare negetive number liye to , isko Integer.MIN_VALUE lenge
int sum =0;
for(int i =0; i<a.length;i++){
    sum += arr[i];
    if(sum > ans){
        ans = sum;

    }
    if(sum < 0){
        sum =0;
    }
} */
