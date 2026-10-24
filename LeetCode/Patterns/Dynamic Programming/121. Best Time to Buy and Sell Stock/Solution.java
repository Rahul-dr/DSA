
class Solution {
    public int maxProfit(int[] prices) {
        int x = 0, y = 1;
        int res = 0;

        while (y < prices.length) {
            if (prices[x] < prices[y]) {
                res = Math.max(res, prices[y] - prices[x]);
            } else {
                x = y;
            }
            y++;
        }

        return res;
    }
}
