// give the minimum no of coins which are spent to pay 
import java.util.Arrays;
import java.util.Comparator;

public class fiveIndianCoins {
    public static void main(String args[]){
        Integer[] coins = { 1,2,5,10,50,100,500,2000};
        int amount = 590;
        int count = 0;
       
        Arrays.sort(coins , Comparator.reverseOrder());//for this condition are sorting the coins in descending order ,
                                                        // kyu ki ascending mein rahega to 121 * 1 dega answe 

        for(int i=0; i<coins.length; i++){
                       
            if(amount >= coins[i]){ 
                int n = amount / coins[i];
                count += n;
                amount = amount % coins[i];
                System.out.println("Used "+n+ " coins of "+ coins[i]);
                
            }
        }
        System.out.println("Total coins to pay:" + count);

    }    
}
