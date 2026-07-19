class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        for (int i=0; i<prices.length; i++) {
            int oncekiPrice= prices[i];
            for (int k=i+1; k<prices.length; k++){
                int sonrakiPrice = prices[k];
                if(sonrakiPrice-oncekiPrice > profit){
                    profit = sonrakiPrice-oncekiPrice;
                }
            }
        }
        return profit;       
    }
}
