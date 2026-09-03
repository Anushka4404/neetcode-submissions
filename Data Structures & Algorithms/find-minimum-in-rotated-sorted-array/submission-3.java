public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int r = nums.length - 1;

        while (left < r) {
            int m = left + (r - left) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                left = m + 1;
            }
        }
        return nums[left];
    }
}