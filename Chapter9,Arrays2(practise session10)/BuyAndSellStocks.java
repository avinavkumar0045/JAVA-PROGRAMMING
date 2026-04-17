public class BuyAndSellStocks {

    public static int StockProfit(int prices[]){ // jab pricebadhe tab sell kro, buy at less price;
       
        int buyprice =Integer.MAX_VALUE ;
        int maxProfit =0;

        for(int i=0;i<prices.length;i++){ // time complexity = O(n)
            if(buyprice< prices[i]){ //profit
               int profit = prices[i] - buyprice;
               maxProfit = Math.max(profit,maxProfit);
            }else{
                buyprice = prices[i]; // jis din no profit, usss din hold karo;
            }
        }

        return maxProfit ;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,6,3,4}; // bought at 1 and sold at 6
        System.out.println(StockProfit(prices));
    }
    
}
