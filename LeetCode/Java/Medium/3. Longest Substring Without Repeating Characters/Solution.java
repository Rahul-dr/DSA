class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        String s1 = "";
        int l = 0;
        int maxL = 0;

        for (int r = 0; r < s.length(); r++) {

            while (s1.contains("" + s.charAt(r))) {
                s1 = s1.substring(1);
                l++;
            }

            s1 = s1 + s.charAt(r);

            maxL = Math.max(maxL, s1.length());
        }

        return maxL;
    }
}