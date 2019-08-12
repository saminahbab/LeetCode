public class profit {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int new_profit;

        int buy;
        int sell;


        for(int i = 0; i <= prices.length - 2; i++){

            buy = prices[i];
            sell = prices[i+1];

            new_profit = sell-buy;

            if(new_profit>profit - new_profit){
                System.out.println(new_profit - profit);
                profit += Math.abs(new_profit - profit);

                System.out.println("PROFIT: " + profit);
            }

        }

        return profit;
    }



}
