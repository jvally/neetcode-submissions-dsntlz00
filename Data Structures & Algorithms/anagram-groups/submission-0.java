class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //approach: is to use the frequency table as the key
        //1.initialise an array of 26 char for each str in string
        //2. convert each string into frequency tables
        //3.do the anagram check then if they are anagrams , append them to an arraylist
        //4.return results


        //1
        Map<String, List<String>> res= new HashMap<>(); 
        for (String s:strs){
            int[]count = new int[26];
            for (char c:s.toCharArray()){
                count[c - 'a']++;//2
            }
            String key = Arrays.toString(count);//converts the frequency array to a key by converting it into a string
            res.putIfAbsent(key, new ArrayList<>());//initialises array if a word of that tfrequency does not exist yet
            res.get(key).add(s);// 3 - adds word to the list if its an anagram 
        
        }

        return new ArrayList<>(res.values());

    }
}
