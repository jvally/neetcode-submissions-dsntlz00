class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int n:nums){
            numbers.add(n);
        }
        int maximumLength = 0;
        int i = 0;
        while(i < nums.length){
            int length = 1;
            if(!numbers.contains(nums[i] - 1)){
                while(numbers.contains(nums[i] + length)){
                    length++;
                } 
                if(length > maximumLength){
                    maximumLength = length;
                }
            }
            i++;
        }
        return maximumLength;
            
        }
    }

