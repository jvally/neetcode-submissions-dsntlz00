class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> counterS = new HashMap<>();
        Map<Character, Integer> counterT = new HashMap<>();
        for (int i =0 ; i < s.length();i++){
            counterS.put(s.charAt(i), counterS.getOrDefault(s.charAt(i), 0) + 1);
            counterT.put(t.charAt(i), counterT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return counterS.equals(counterT);

    }
}
