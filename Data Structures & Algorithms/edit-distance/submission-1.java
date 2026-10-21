class Solution {
    public int idr(String word1, String word2,int n ,int m) {
        int [][] t = new int[n+1][m+1];
        for (int i=0;i<=n;i++) {
            t[i][0] = i;
        }
        for (int j=0;j<=m;j++) {
            t[0][j] = j;
        }
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=m;j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1)) {
                    t[i][j] = t[i-1][j-1];
                }
                else {
                    t[i][j] = 1 + Math.min(t[i-1][j],
                    Math.min(t[i][j-1],t[i-1][j-1]));
                }
            }
        }
        return t[n][m];
    }
    public int minDistance(String word1, String word2) {
        return idr(word1,word2,word1.length(),word2.length());
    }
}
