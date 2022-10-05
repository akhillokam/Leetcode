<<<<<<< HEAD
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
=======
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
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}