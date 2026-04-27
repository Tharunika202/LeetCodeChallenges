class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int mincost= prices[0];
        for(int i =1;i<prices.length;i++){
            int temp_profit= prices[i] - mincost;
            if(prices[i] < mincost){
                mincost = prices[i];
            }
            if(temp_profit> profit){
                profit = temp_profit;
            }
            
        }
    return profit;
    }
}