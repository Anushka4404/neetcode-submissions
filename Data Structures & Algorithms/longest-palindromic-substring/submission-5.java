class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int maxlen = 1;
        for (int i=0;i<n;i++)  {
            int left = i,right = i; //odd
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
                if (right-left+1>maxlen) {
                    start = left;
                    maxlen = right-left+1;
                }
                left--;
                right++;
            }
            left = i;
            right = i+1;
            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
                if (right-left+1>maxlen) {
                    start = left;
                    maxlen = right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,start+maxlen);
    }
}
