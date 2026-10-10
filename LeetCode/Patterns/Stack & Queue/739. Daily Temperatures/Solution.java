class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] resa=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int l=i+1;
            while(l<temperatures.length && temperatures[i]>=temperatures[l]){
                l++;
            }

            if(l>=temperatures.length){
                resa[i]=0;
            }else{
                resa[i]=l-i;
            }

        }

        return resa;
    }
}