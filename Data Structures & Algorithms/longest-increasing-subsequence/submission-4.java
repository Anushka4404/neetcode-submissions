class Solution {
    public int lcs(int[] nums1,int[] nums2,int n,int m) {
        int[][] t = new int[n+1][m+1];
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=m;j++) {
                if (nums1[i-1]==nums2[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else {
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][m];
    }
    public int lengthOfLIS(int[] nums) {
        int [] nums1 = nums.clone();
        int [] nums2 = nums.clone();
        Arrays.sort(nums2);
        int j=0;
        for (int i=1;i<nums2.length;i++) {
            if (nums2[i]!=nums2[j]) {
                j++;
                nums2[j] = nums2[i];
            }
        }
        nums2 = Arrays.copyOf(nums2,j+1);
        return lcs(nums1,nums2,nums.length,nums2.length);
    }
}
