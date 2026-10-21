class Solution {
    int[] t;
    public int dfs(String s,int i) {
        int n = s.length();
        if (i==n)  return 1;
        if (s.charAt(i)=='0')  return 0;
        if (t[i]!=-1)  return t[i];
        int res = dfs(s,i+1);
        if (i<n-1) {
            if (s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<'7') {
                res+=dfs(s,i+2);
            }
        }
        return t[i]=res;
    }
    public int numDecodings(String s) {
        int n = s.length();
        t = new int[n+1];
        Arrays.fill(t,-1);
        return dfs(s,0);
    }
}
