class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        
        Map<Character, Integer> m=new HashMap<>();
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();

        for(char c: c1){
            m.put(c, m.getOrDefault(c, 0) +1);
        }

        for(char c: c2){
            m.put(c, m.getOrDefault(c, 0) -1);
        }

        for(Map.Entry<Character, Integer> entry: m.entrySet()){
            if(entry.getValue()!=0) return false; 
        }

        return true;

    }
}