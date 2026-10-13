class Solution {
    int []t;
    public int climbStairs(int n) {
      t = new int[n+1];
        return dfs(n,0);
    }
    public int dfs(int n,int i) {
        if (i==n) {
          return 1;
        }
        if (i>n) {
          return 0;
        }
        if (t[i]!=0) {
          return t[i];
        }
      t[i] = dfs(n,i+1)+dfs(n,i+2);
      return t[i];
    }
}
