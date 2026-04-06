class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length;i++){
            if(nums[i] > 0)break;//greater than 0, hence sum > 0
            if(i > 0 && nums[i] == nums[i - 1]) continue;//handles duplicates
            int a = nums[i], left = i + 1, right = nums.length - 1;
            while (left < right){
                int threeSum = a + nums[left] + nums[right];
                if(threeSum > 0){
                    right--;
                } else if (threeSum < 0){
                    left++;
                } else {
                    res.add(Arrays.asList(a, nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;//handles duplicates
                    }
                }
            }
        }
        return res;

    }

}
