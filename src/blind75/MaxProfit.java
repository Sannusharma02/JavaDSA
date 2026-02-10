package blind75;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            profit = Math.max(price - min, profit);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit(prices));
    }
}
