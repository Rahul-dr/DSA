class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[] count=new int[26];

        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();

        for(int i=0;i<s.length();i++){
            count[c1[i]-'a']++;
            count[c2[i]-'a']--;
        }

        for(int n: count){
            if(n!=0) return false;
        }

        return true;

    }
}