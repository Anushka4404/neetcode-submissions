class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] output = new int[n];
        int p=1,d=nums[0];
        for (int i=0;i<n;i++) {
            int prod = 1;
            for (int j=0;j<n;j++) {
                if (i!=j) {
                    prod*=nums[j];
                }
            }
            output[i] = prod;
        }
        return output;
    }
}  
