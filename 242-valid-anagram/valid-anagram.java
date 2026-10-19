class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char [] s2 = t.toCharArray();
        HashMap<Character, Integer> res1 = valid(s1);
        HashMap<Character, Integer> res2 = valid(s2);
        
        return(res1.equals(res2));
    }
    static HashMap<Character, Integer> valid(char[] s){
        HashMap<Character, Integer> res = new HashMap<>();
        for (char val : s) {
            res.merge(val, 1, Integer::sum);
        }
        return res;
    }
}