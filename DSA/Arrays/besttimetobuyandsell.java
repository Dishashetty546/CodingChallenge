package Arrays;

public class besttimetobuyandsell {
    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        System.out.println(sellandbuy(prices));

    }

    public static int sellandbuy(int[] prices) {
        int buy_prices = prices[0];
        int profit = 0;
        int current_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy_prices) {
                buy_prices = prices[i];
            }
            current_profit = prices[i] - buy_prices;
            profit = Math.max(current_profit, profit);

        }
        return profit;

    }

}
