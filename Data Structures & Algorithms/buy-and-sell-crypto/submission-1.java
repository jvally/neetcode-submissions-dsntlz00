class Solution {
    public int maxProfit(int[] prices) {
        int net = 0;
        int l = 0, r = l + 1;
        while (r < prices.length){
            if(prices[l] < prices[r]){
                net = Math.max(prices[r] - prices[l], net);//if right is higher then update max
            } else {
                l = r;//else since its lower or equal shift the pointer to the current day - best day to buy :lowest price
            }
            r++;
        }
        return net;
    }
}
