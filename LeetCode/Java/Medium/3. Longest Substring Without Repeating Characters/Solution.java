class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        int ma=0;

        for(int i=0;i<s.length();i++){
            int j=i;
            Set<Character> set=new HashSet<>();
            int count=0;
            while(j<c.length && !set.contains(c[j])){
                set.add(c[j]);
                count++;
                j++;
            }
            ma=Math.max(ma, count);

        }

        return ma;
    }
}