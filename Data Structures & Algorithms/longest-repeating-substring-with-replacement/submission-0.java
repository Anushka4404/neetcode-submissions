class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashSet<Character>set = new HashSet<>();
        int res=0;
        for (char c:s.toCharArray()) {
            set.add(c);
        }
        for (char c:set) {
            int count=0,l=0;
            for (int r=0;r<n;r++) {
                if (s.charAt(r)==c)  count++;
            while ((r-l+1)-count>k) {
                if (s.charAt(l)==c) {
                    count--;
                }
                l++;
            }
            res = Math.max(res,r-l+1);
        }
    }
        return res;
    }
}
