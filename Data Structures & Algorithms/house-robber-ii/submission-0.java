class Solution {
    int[] t;
    public int dfs(int[] nums,int i,int end) {
        int n = nums.length;
        if (i>end)  return 0;
        if (t[i]!=-1)  return t[i];
        t[i] = Math.max(dfs(nums,i+1,end),nums[i]+dfs(nums,i+2,end));
        return t[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1)  return nums[0];

        t = new int[n+1];
        Arrays.fill(t,-1);
        int ans1 = dfs(nums,0,n-2); //1st include & last exclude

        t = new int[n+1];
        Arrays.fill(t,-1);
        int ans2 = dfs(nums,1,n-1); //lst exclude && last include

        return Math.max(ans1,ans2);
    }
}
