class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int pivot = 0;
        while(l < r){
            int m = (l + r)/2;
            if(nums[m] > nums[r]){
                l = m + 1;
            } else{
                r = m;
            }
        }
        pivot = l;
        l = 0;
        r = nums.length - 1;
        if(nums[pivot] <= target && target <= nums[r]){
            l = pivot;//shifting to the required part of the sorted array
        } else {
            r = pivot - 1;
        }
        while(l <= r){//normal binary search after we are in the right part of the arr
            int m = (l + r)/ 2;
            if(nums[m] == target){
                return m;
            } else if(nums[m] > target){
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
