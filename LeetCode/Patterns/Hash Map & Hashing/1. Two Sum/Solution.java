class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0; i<nums.length; i++){

            int a=target-nums[i];
            if(m.containsKey(a)){
                return new int[]{m.get(a), i};
            }

            m.put(nums[i], i);
        }

        return new int[]{};
    }
}