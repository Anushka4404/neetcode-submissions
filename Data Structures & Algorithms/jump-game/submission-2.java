class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n-1;
        for (int i=n-2;i>=0;i--) {
            if (i+nums[i]>=goal) {
                goal = i;
            }
        }
        if (goal==0)  return true;
        return false;
    }
    // public boolean dfs(int[] nums,int i) {
    //     if (i==nums.length-1) {
    //         return true;
    //     }
    //     int end = Math.min(nums.length-1,i+nums[i]);
    //     for (int j=i+1;j<=end;j++) {
    //         if (dfs(nums,j)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
