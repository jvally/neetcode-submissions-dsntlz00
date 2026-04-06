class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        result[0] = 1;
        for(int i = 1;i < nums.length;i++){
            prefix = nums[i - 1];
            result[i] = result[i - 1] * prefix;//calulating product b4 i
        }
        int suffix = 1;
        for(int i = nums.length - 2; i >= 0;i--){
            suffix *= nums[i + 1];
            result[i] = suffix * result[i];
        }

        return result;

    }
}  
