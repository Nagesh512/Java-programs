public class profit_on_buy_and_sellStock {
    
    public static int BuyandSell_Stock(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(buy_price<prices[i]){
               int profit = prices[i] - buy_price;
               Maxprofit = Math.max(profit, Maxprofit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Profit gain is : " +BuyandSell_Stock(prices));
    }
}
