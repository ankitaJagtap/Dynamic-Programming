class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            minSoFar = Math.min(prices[i], minSoFar);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}