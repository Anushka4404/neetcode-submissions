class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int i=0,j=0;
        StringBuilder result = new StringBuilder();
        while (i<n1 && j<n2) {
            result.append(word1.charAt(i));
            i++;
            result.append(word2.charAt(j));
            j++;
        }
            result.append(word1.substring(i));
            result.append(word2.substring(j));
        return result.toString();
    }
}