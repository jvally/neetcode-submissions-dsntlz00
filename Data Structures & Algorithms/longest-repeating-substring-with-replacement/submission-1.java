class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;//maximum
        Set<Character> charSet = new HashSet<>();//freq of char
        for(int i = 0; i < s.length();i++){
            charSet.add(s.charAt(i));
        }

        for (char c: charSet){
            int l = 0, count = 0;
            for (int r = 0;r < s.length(); r++){
                if(s.charAt(r) == c){
                    count++;//increase number of c seen
                }
                while ((r - l + 1) - count > k){
                    if(s.charAt(l) == c){
                        count--;
                    }
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}
