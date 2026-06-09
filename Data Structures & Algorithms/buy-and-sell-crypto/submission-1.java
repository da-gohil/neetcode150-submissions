class Solution {
    public int maxProfit(int[] prices) {
        
        //checker
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length){
            
            if(prices[right] < prices[left]){
                left = right;
            }else{ 
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            }
            right++;
        }
        return maxProfit;
    }
}
