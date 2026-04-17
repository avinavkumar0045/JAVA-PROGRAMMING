// similar approch to first activity Selection
import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] start  ={5,39,5,27,50};
        int[] end ={24,60,28,40,90};
        int count =0;

        int [][] pair = {{5,24},{39,60},{5,28},{27 ,40},{50,90}}; 

        

        for(int i =0 ; i<start.length;i++){
            pair[i][0] = i;
            pair[i][1] = start[i];
            pair[i][2] = end[i];

        }
        

        Arrays.sort(pair , Comparator.comparingInt(o-> o[2]));
        for(int i =0; i<start.length;i++){
            if(pair[i][2] <= pair[i+1][1]){ // comparing last index end point with next index start point 
                count ++;
            }else{
                break;
            }

        }
        System.out.println("The maximum count will be :"+ count);

    



    }
    
}
