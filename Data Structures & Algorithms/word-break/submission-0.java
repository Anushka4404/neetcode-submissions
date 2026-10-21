class Solution {
    int []t;
    public boolean dfs(String s,List<String>wordDict,int i) {
        if (i==s.length())  return true;
        if (t[i]!=-1)  return t[i]==1;
        for (String w:wordDict) {
            if (i+w.length()<=s.length() && s.substring(i,i+w.length()).equals(w)) {
                if (dfs(s,wordDict,i+w.length())) {
                    t[i] = 1;
                    return true;
                }
            }
        }
        t[i] = 0;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        t = new int[s.length()+1];
        Arrays.fill(t,-1);
        return dfs(s,wordDict,0);
    }
}
