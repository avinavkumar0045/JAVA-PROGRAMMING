

public class KadanseAlgorithm { // for max sub array // Notvalid if, all are -ve integers

    public static void kadanse(int numbers[]){
        int CurrSum =0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length;i++){  // time complexity O(n)
            CurrSum = CurrSum + numbers[i];
            if(CurrSum < 0){
                CurrSum = 0;  // if currSum < 0; currSum =0,not CurrSum += 0;
            } 

            if(CurrSum>MaxSum){  // or MaxSum = MAth.max(MathSum,CurrSum);
                MaxSum = CurrSum;
            }
        }
        System.out.println( "Max sum is :"+MaxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = { 1,3,-2,4,5};
        kadanse(numbers);
    }
}
