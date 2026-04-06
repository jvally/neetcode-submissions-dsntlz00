class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap that stores the frequency of all items in array
        //return k number of highest numbers

        //1. create a hashmap - key is the number and value is the freq
        List<Integer>[] count = new List[nums.length + 1];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums){
            freq.put(num, freq.getOrDefault(num , 0) + 1);
        }
        for (int i = 0; i< count.length; i++){
            count[i] = new ArrayList<>();//initalise an arraylist for each freq
        }
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            count[entry.getValue()].add(entry.getKey());
        }//filling in values in freq list 
        
        //2. create an array of fixed size of k
        int[] res = new int[k];
        int index = 0 ;
        for (int i = count.length - 1; i > 0 && index < k; i--){
            for (int n: count[i]){
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
