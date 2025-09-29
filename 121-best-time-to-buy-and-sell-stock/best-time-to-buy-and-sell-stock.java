class Solution {
    public int maxProfit(int[] prices) {
        int global_max=0, cur_max=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<cur_max){
                cur_max = prices[i];
            }
            if(global_max < prices[i] - cur_max) {
                global_max = prices[i] - cur_max;
            }
        }
        return global_max;
    }
}