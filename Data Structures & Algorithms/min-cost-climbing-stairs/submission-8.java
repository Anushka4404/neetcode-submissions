class Solution {
    int[] t;
    public int dfs(int[] cost,int i) {
        int n = cost.length;
        if (i>=n)  return 0;
        if (t[i]!=-1)  return t[i];
        return t[i]=cost[i]+Math.min(dfs(cost,i+1),dfs(cost,i+2));
    }
    public int minCostClimbingStairs(int[] cost) {
        t = new int[cost.length+1];
        Arrays.fill(t,-1);
        return Math.min(dfs(cost,0),dfs(cost,1));
    }
}
