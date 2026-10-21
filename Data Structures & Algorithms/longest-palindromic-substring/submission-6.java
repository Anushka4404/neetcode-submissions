class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];
        int start = 0,maxlen=1;
        for (int i=0;i<n;i++) {
            t[i][i] = true;
        }
        for (int len=2;len<=n;len++) {
            for (int i=0;i<=n-len;i++) {
                int j = i+len-1;
                if (s.charAt(i)==s.charAt(j)) {
                    if (len==2) {
                        t[i][j] = true;
                    }
                    else {
                        t[i][j] = t[i+1][j-1];
                    }
                }
                if (t[i][j] && len>maxlen) {
                    start = i;
                    maxlen = len;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }
}
