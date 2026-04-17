public class Question3 {  // stocks related questiion   

    public static int StocksProfit(int prices[]){ // Print maxProfit,if no profit print 0.
       
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ // Profit condition
               int  profit =  prices[i] -buyPrice;
               maxProfit = Math.max(profit,maxProfit); 
            }else{
                buyPrice = prices[i];  
            }
        }
        if(maxProfit <= 0){ // yeha condn. place kro. // diff than the theory qn we did.
            return 0;
        }

        return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};

        System.out.println( "MaxProfit is:"+ StocksProfit(prices));
    }
    
}
