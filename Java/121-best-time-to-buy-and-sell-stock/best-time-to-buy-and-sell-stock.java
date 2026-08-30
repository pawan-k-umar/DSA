class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res= 0;
         for(int i=1;i<prices.length;i++){
            int profit = prices[i] - min;
            if(profit > res){
                res = profit;
            }
            if(prices[i] < min){
                min = prices[i];
            }
            
        }
        return res;
    }
}