class Solution {
    public int maxProfit(int[] prices) {
        
        int mi=Integer.MAX_VALUE;
        int ma=0;
        int x=0, y=1;
        int res=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[x]<prices[y]){
                mi=Math.min(mi, prices[x]);
                ma=Math.max(ma, prices[y]);

                res=ma-mi;
                y++;
                
            }else{
                x++; y++;
            }
        }

        return res;
    }
}