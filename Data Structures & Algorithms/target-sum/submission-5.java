class Solution {
    public int sum(int [] nums,int target,int n) {
        int [][] t = new int[n+1][target+1];
        for (int i=0;i<=n;i++) {
            t[i][0] = 1;
        }
        //if (n==0 && target==0)   return 0;
        for (int i=1;i<=n;i++) {
            for (int j=0;j<=target;j++) {
                if (j>=nums[i-1]) {
                    t[i][j] = t[i-1][j-nums[i-1]] + t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        if (Math.abs(target)>sum)  return 0;
        if ((sum+target)%2!=0)  return 0;
        int sum1 = (sum+target)/2;
        return sum(nums,sum1,n);
    }
}
