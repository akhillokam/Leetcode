class Solution {
    public int maxProfit(int[] prices) {
       int price_min = Integer.MAX_VALUE;
        int max_gain = 0;
        
        for(int i =0; i<prices.length;i++){
            if(prices[i] < price_min){
                price_min = prices[i];
            } else if (prices[i] - price_min > max_gain){
                max_gain = prices[i] - price_min;
            }
        }
        return max_gain;    }
}