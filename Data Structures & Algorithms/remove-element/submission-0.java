class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        List<Integer>ans = new ArrayList<>();
        int cnt=0;
        // for (int num:nums) {
        //     if (num!=val) {
        //         ans.add(num);
        //     }
        // }
        // for (int i=0;i<ans.size();i++) {
        //     nums[i] = ans.get(i);
        // }
        // return ans.size();
        for (int i=0;i<n;i++) {
            if (nums[i]!=val) {
                nums[cnt++] = nums[i];
            }
        }
        return cnt;
    }
}