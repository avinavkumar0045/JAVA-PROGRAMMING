

public class MaxsSubArrayII {  // prefix method
    public static void MaxSubArray(int numbers[]){  // time complexity : O(n^2) <O(n^3)
        int n = numbers.length;
        int currSum = 0;
        int MaxSum =Integer.MIN_VALUE;
        int[] prefix = new int[n];

        prefix[0] = numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = numbers[i]+ prefix[i-1];
           
        }
        MaxSum = prefix[n-1];

        for(int i=0;i<n;i++){
            int start =i;
            for(int j=i;j<n;j++){
                int end =j;

            currSum = start ==0? prefix[end] : prefix[end] - prefix[start];
                
                if(MaxSum <currSum){
                    MaxSum = currSum;
                }
            }

        }
        System.out.println("MaxxSum is :"+MaxSum);
    }
    

    public static void main(String[] args) {
       int  numbers[] = {1,2,3,4};
        MaxSubArray(numbers);
    }
}
