class Solution {
    // public boolean validPalindrome(String s) {
    //     if (isPaindrome(s)) {
    //         return true;
    //     }
    //     for (int i=0;i<s.length();i++) {
    //         String newS = s.substring(0,i) + s.substring(i+1);
    //         if (isPaindrome(newS)) {
    //         return true;
    //         }
    //     }
    //     return false;
    // }
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while (l<r) {
            if (s.charAt(l)!=s.charAt(r)) {
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(String s,int l, int r) {
        int n = s.length();
        //left=0,right = n-1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    return false;
                }
                l++;
                r--;
            }
        return true;
    }
}