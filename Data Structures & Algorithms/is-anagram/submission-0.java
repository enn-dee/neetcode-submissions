class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> tmp = new HashMap<Character, Integer>();
        

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            tmp.put(ch, tmp.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
           char c = t.charAt(i);

            if (!tmp.containsKey(c)) {
                return false;
            }

            tmp.put(c, tmp.get(c) - 1);

            if (tmp.get(c) < 0) {
                return false;
            }
        }

        
return true;
    }
}
