class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int r=0,l=0,res=0;
        while (r<n-1) {
            int farthest = 0;
            for (int i=l;i<=r;i++) {
                farthest = Math.max(farthest,nums[i]+i);
            }
            l=r+1;
            r = farthest;
            res++;
        }
        return res;
    }
}
