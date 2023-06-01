import java.util.*;

public class BuyAndSellStock{

    //Brute force
    public static int printBuyAndSellStock(int prices[])
    {
        if(prices.length == 1)
            return 0;
        if(prices.length == 2)
            return prices[0]<prices[1] ? prices[1]-prices[0]:0;
        
        int profitStock = 0;
        for(int currentDay=0; currentDay<prices.length; currentDay++)
        {
            int buying = prices[currentDay];
            for(int futureDay=currentDay+1; futureDay<prices.length; futureDay++)
            {
                int selling  = prices[futureDay];
                profitStock = Math.max(profitStock,selling-buying);
            }
        }

        return profitStock;
    }

    // Optimize

    public static int printBuyAndSellStock2(int prices[])
    {
        if(prices.length == 1)
            return 0;
        if(prices.length == 2)
            return prices[0]<prices[1] ? prices[1]-prices[0]:0;
        
        int buyingStock = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int currentDay=1; currentDay<prices.length; currentDay++)
        {
            int currentDayPrice = prices[currentDay-1];
            int sellingStock = prices[currentDay];
            buyingStock = Math.min(buyingStock,currentDayPrice);
            MaxProfit = Math.max(MaxProfit,sellingStock-buyingStock);
        }

        return MaxProfit;
    }




    public static void main(String[] args){
            int prices[] = {7,6,4,3,1};//7,1,5,3,6,4

            System.out.println(printBuyAndSellStock(prices));
            System.out.println(printBuyAndSellStock2(prices));

    }
}