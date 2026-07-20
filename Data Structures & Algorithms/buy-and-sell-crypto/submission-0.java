class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int minBuy = prices[0];
        for (int i=1;i<prices.length;i++) {
            maxi = Math.max(maxi,prices[i]-minBuy);
            minBuy = Math.min(minBuy, prices[i]);
        }
        return maxi;
    }
}
