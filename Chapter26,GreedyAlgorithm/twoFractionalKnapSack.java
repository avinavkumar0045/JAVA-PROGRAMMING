//  15/02
import java.util.Arrays;
import java.util.Comparator;

public class twoFractionalKnapSack {
    public static void main(String args[]){
        int[] Val = {60,100,120};
        int[] wt = {10,20,30};
        int maxWt = 50;

        double [][] ratio = new double[Val.length][2]; // 2 columns , one for index and other for ratio

        for(int i=0;i<Val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)Val[i] / wt[i]; //as the greedy approch works on the ratio of (value / weigth)

        }

        // lamda sorting function on the basis of 2nd column
        Arrays.sort(ratio, Comparator.comparingDouble(o-> o[1])); // here square bracket, this is ascending order sorting

        int capacity = maxWt;
        int valOFHeap = 0;

        for(int i= ratio.length-1 ; i>= 0; i--){ // we have to see the ratio in descending order 
            int idx = (int)ratio[i][0]; // this is to know the value from the col(idx ),ki kaun sa phele hai and kaun sa baad mein
            if(capacity >= wt[idx]){
                valOFHeap += Val[idx];
                capacity = capacity - wt[idx];

            }else{ // INCLUDING FRACTIONAL ITEM 
                valOFHeap += (capacity * ratio[i][1]); //  ratio of (val / wt), means val per unti weight 
                capacity  = 0;
                break;

            }
        }
        System.out.println("THe maximum value of heap is : "+valOFHeap);
    }
    
}
