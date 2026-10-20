// class Solution {
//     public String lcs(String s1,String s2,int n,int m) {
//         int[][]t = new int[n+1][m+1];
//         for (int i=1;i<=n;i++) {
//             for (int j=1;j<=m;j++) {
//                 if (s1.charAt(i-1)==s2.charAt(j-1)) {
//                     t[i][j] = 1 + t[i-1][j-1];
//                 }
//                 else {
//                     t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
//                 }
//             }
//         }
//         int i=n,j=m;
//         StringBuilder s = new StringBuilder();
//         while (i>0 && j>0) {
//             if (s1.charAt(i-1)==s2.charAt(j-1)) {
//                 s.append(s1.charAt(i-1));
//                 i--;
//                 j--;
//             }
//             else {
//                 if (t[i][j-1]>t[i-1][j-1]) {
//                     j--;
//                 }
//                 else {
//                     i--;
//                 }
//             }
//         }
//         return s.reverse().toString();
//     }
//     public String longestPalindrome(String s) {
//         String s2 = new StringBuilder(s).reverse().toString();
//         return lcs(s,s2,s.length(),s2.length());
//     }
// }

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int left = i, right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
