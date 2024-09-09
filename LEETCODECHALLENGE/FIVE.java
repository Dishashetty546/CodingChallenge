package LEETCODECHALLENGE;

//BEST TIME TO BUY AND SELL STOCKS
public class FIVE {
    public static void main(String[] args) {
        int[] prices = { 2, 3, 1, 5, 8, 4 };
        System.out.println(maxprofits(prices));
    }

    public static int maxprofits(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int currentprofit = prices[i] - min;
                if (currentprofit > maxprofit) {
                    maxprofit = currentprofit;
                }
            }
        }
        return maxprofit;
    }

}
