class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;

  int maxProfit = 0;
  int minPrice = prices[0];
  for(int i=1; i<l; i++) {
    maxProfit = Math.max(maxProfit, prices[i]-minPrice);
    minPrice = Math.min(minPrice, prices[i]);
  }

  return maxProfit;
        
    }
}