class Solution {
    int[] t;
    public int solve(int[] cost,int i) {
        int n = cost.length;
        if(i>=n)  return 0;
        if (t[i]!=-1)  return t[i];
        t[i] = cost[i]+Math.min(solve(cost,i+1),solve(cost,i+2));
        return t[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        t = new int[n+1];
        Arrays.fill(t,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
}
