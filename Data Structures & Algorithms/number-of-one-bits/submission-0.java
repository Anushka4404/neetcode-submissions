class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        String binaryString = Integer.toBinaryString(n);
        for (char c:binaryString.toCharArray()) {
            if (c=='1') {
                cnt++;
            }
        }
        return cnt;
    }
}
