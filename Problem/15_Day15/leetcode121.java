
// Buy and sell product and return maximum profit

public class leetcode121 {

    public static int maximum_profit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit = "+maximum_profit(prices)); // Output: 5
        
    }
}
