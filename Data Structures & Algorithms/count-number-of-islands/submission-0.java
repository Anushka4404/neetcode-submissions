class Solution {
    public void bfs(char[][] grid,int i,int j,boolean [][]visited) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]>q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j] = true;

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int row = node[0];
            int col = node[1];

            for (int k=0;k<4;k++) {
                int nr = row + dr[k];
                int nc = col + dc[k];
                if (nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && !visited[nr][nc]) {
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        int cnt=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (grid[i][j]=='1' && !visited[i][j]) {
                    cnt++;
                    bfs(grid,i,j,visited);
                }
            }
        }
        return cnt;
    }
}
