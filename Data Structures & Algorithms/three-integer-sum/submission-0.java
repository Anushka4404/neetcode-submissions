class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>>result = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer>res = Arrays.asList(nums[i],nums[j],nums[k]);
                        result.add(res);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
