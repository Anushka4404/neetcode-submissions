class Solution {
    int[][] t;
    public int dfs(int [][] matrix,int i,int j) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (i>=m || j>=n)   return 0;
        if (i==m-1 && j==n-1)  return 1;
        if (t[i][j]!=-1)  return t[i][j];
        int right = dfs(matrix,i,j+1);
        int down = dfs(matrix,i+1,j);
        return t[i][j] = right+down;
    }
    public int uniquePaths(int m, int n) {
        int [][] matrix = new int[m][n];
        t = new int[m+1][n+1];
        for (int i=0;i<=m;i++) {
            Arrays.fill(t[i],-1);
        }
        return dfs(matrix,0,0);
    }
}
