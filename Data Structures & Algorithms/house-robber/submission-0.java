class Solution {
    int[] t;
    public int dfs(int[] nums,int i) {
        int n = nums.length;
        if (i>=n)  return 0;
        if (t[i]!=-1)  return t[i];
        t[i] = Math.max(dfs(nums,i+1),nums[i]+dfs(nums,i+2));
        return t[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        t = new int[n+1];
        Arrays.fill(t,-1);
        return dfs(nums,0);
    }
}
