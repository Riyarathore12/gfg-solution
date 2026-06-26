class Solution {
    public int maxProfit(int[] prices) {
        // Code here
       int n = prices.length;
       int minprice =prices[0];
       int profit = 0;
       for(int i = 0; i<n; i++){
           minprice = Math.min(minprice , prices[i]);
           profit = Math.max(profit , prices[i] - minprice);
       }
       return profit;
    }
}