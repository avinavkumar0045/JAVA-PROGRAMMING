// similar approch to first activity Selection
import java.util.*;

public class fourMaxLengthChainOfPair {
    public static void main(String[] args) {
        int [][] pairs = {{5,24},{39,60},{5,28},{27 ,40},{50,90}}; 

        Arrays.sort(pairs , Comparator.comparingInt(o-> o[1]));
        int chainLen =1; // kyu ki ek to aayega hi, first wala
        int chainEnd = pairs[0][1]; // Last selected pair end // chain end

        for(int i =1; i<pairs.length;i++){
            if(pairs[i][0] >= chainEnd){ // comparing last index end point with next index start point 
                chainLen ++;
                chainEnd = pairs[i][1];
            }

        }
        System.out.println("The maximum Lenght will be :"+ chainLen);

    }
    
}
