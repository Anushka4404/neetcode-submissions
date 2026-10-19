class Solution {
    int[] t;
    public int dfs(int n,int i) {
        if (i>n)  return 0;
        if (i==n)  return 1;
        if (t[i]!=-1)  return t[i];
        return t[i]=dfs(n,i+1) + dfs(n,i+2);
    }
    public int climbStairs(int n) {
        t = new int[n+1];
        Arrays.fill(t,-1);
        return dfs(n,0);
    }
}
