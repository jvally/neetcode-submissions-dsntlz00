class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int num : nums){
            if(res.contains(num)){
                return true;
            } else{
                res.add(num);
            }
        }
        return false;
    }
}