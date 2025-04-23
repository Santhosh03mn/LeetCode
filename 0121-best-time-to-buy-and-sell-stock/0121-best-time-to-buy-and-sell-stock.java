class Solution {
    public int maxProfit(int[] prices) {
        int Price = Integer.MAX_VALUE;
        int Profit = 0;
        for (int currentPrice : prices) {
            Price = Math.min(currentPrice, Price);
            Profit = Math.max(Profit, currentPrice - Price);
        }
        return Profit;
    }
}