class Solution {
    public int maxSubArray(int[] nums) {
        int ma=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int count=0;
            int maxx=Integer.MIN_VALUE;
            for(int j=i;j<nums.length;j++){
                if(i==j){
                    maxx=Math.max(maxx, nums[j]);
                }else{
                    if(count==0){
                        count=maxx+nums[j];
                        
                    }else{
                        count+=nums[j];
                        
                    }
                    maxx=Math.max(maxx, count);
                    
                }
            }

            ma=Math.max(ma, maxx);
        }

        return ma;

    }
}