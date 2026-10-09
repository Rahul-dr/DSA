class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> m=new HashMap<>();
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        for(char c: sc){
            m.put(c, m.getOrDefault(c, 0)+1);
        }

        for(char c: tc){
            m.put(c, m.getOrDefault(c, 0)-1);
        }

        for(int val: m.values()){
            if(val!=0) return false;
        }

        return true;

    }
}